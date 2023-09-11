package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import dto.Team;

public class TeamDAO {
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
	
	// 팀 삽입
	public static int insertTeam(Connection conn, Team team) {
		PreparedStatement pstmt = null;
		String sql = "insert into team (name, local) values(?,?)";
		
		int cnt = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, team.getName());
			pstmt.setString(2, team.getLocal());
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
		
		return cnt;
	}
	
	// 팀 조회
	public static Team selectTeam(Connection conn, String teamName) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Team team = null;
		String sql = "select * from team where name = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teamName);
			rs = pstmt.executeQuery();
			if(rs != null && rs.next()) {
				Integer num = rs.getInt(1);
				String name = rs.getString(2);
				String local = rs.getString(3);
				team = new Team(num, name, local);
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
		
		return team;
	}
	
	// 팀 목록 조회
	public static List<Team> selectTeamList(Connection conn) {
		List<Team> teamList = new ArrayList<>();
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from team";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs != null) {
				while(rs.next()) {
					Integer num = rs.getInt(1);
					String name = rs.getString(2);
					String local = rs.getString(3);
					teamList.add(new Team(num, name, local));
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		return teamList;
	}
}
