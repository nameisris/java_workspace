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
import com.kosta.product.Goods;

public class goodsDAO {
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
	
	// 상품 추가
	public static int insertProduct(Goods goods) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into goods (code, name, price, stock, category) values(?,?,?,?,?)";
		
		int cnt = 0;
		
		try {
			System.out.println(goods.getCode());
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, goods.getCode());
			pstmt.setString(2, goods.getName());
			pstmt.setInt(3, goods.getPrice());
			pstmt.setInt(4, goods.getStock());
			pstmt.setString(5, goods.getCategory());
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
		return cnt;
	}
	
	// 상품 정보 조회
	public static Goods selectProductByCode(String code) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from goods where code = ?"; 
		Goods goods = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
			
			if(rs != null && rs.next()) {
				String rcode = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				int stock = rs.getInt(4);
				String category = rs.getString(5);
				goods = new Goods(rcode, name, price, stock, category);
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
		
		return goods;
	}
	
	// 전체 상품 정보 출력
	public static void selectAllProductInfo() {
		Connection conn = getConnection();
		List<Goods> goodsList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from goods";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs != null) {
				while(rs.next()) {
					String code = rs.getString(1);
					String name = rs.getString(2);
					int price = rs.getInt(3);
					int stock = rs.getInt(4);
					String category = rs.getString(5);
					goodsList.add(new Goods(code, name, price, stock, category));
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		close(conn);
	}
	
	// 재고량 변경
	public static void updateProduct(int amount, Order order) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		
		// 특정 코드의 제품 정보 조회
		Goods goods = selectProductByCode(order.getProductCode());
		// 취소
		if(order.isCanceled()) {
			
		}
		// 해당 제품 수량
		int stock = goods.getStock();
	
		String sql = "update goods set stock = ? where code = ?";
		
//		try {
//			pstmt = conn.prepareStatement(sql);
//			
//		}
		
	}
}
