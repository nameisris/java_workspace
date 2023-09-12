package com.kosta.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kosta.order.Order;

public class orderDAO {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties"));
			Class.forName(db.getProperty("driver"));
			conn = DriverManager.getConnection(db.getProperty("url"),
					db.getProperty("user"), db.getProperty("password"));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null) conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 주문 추가
	// 재고량 감소
	public static int insertOrder(Order order) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into orders (customer, productcode, amount) values(?,?,?)";
		
		int cnt = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, order.getCustomer());
			pstmt.setString(2, order.getProductCode());
			pstmt.setInt(3, order.getAmount());
			// pstmt.setBoolean(4, false);
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		close(conn);
		
		goodsDAO.updateProduct(order);
		
		return cnt;
	}
	
	// 전체 주문 정보 출력
	public static void selectAllOrderInfo() {
		Connection conn = getConnection();
		List<Order> ordersList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select customer, productcode, amount from orders";

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			if (rs != null) {
				while (rs.next()) {
					String customer = rs.getString(1);
					String productcode = rs.getString(2);
					int amount = rs.getInt(3);
					ordersList.add(new Order(customer, productcode, amount));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		close(conn);
	}
		
	// 주문 정보 조회
	public static Order selectOrderByNo(int orderNo) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Order order = null;
		String sql = "select * from orders where no = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, orderNo);
			rs = pstmt.executeQuery();
			
			if(rs != null && rs.next()) {
				String customer = rs.getString(1);
				String productcode = rs.getString(2);
				int amount = rs.getInt(3);
				order = new Order(customer, productcode, amount);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		close(conn);
		
		return order;
	}
	
	// 주문 취소
	// 재고량 증감 메서드 호출
	public static Order updateOrder(int orderNo) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		Order order = null;
		String sql = "update orders set iscanceled = ? where no = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setBoolean(1, true);
			pstmt.setInt(2, orderNo);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
			
		close(conn);
		return order;
	}
}
