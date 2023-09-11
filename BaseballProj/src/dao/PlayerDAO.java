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

import dto.Player;

public class PlayerDAO {
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
	
	// 선수 삽입
	public static int insertPlayer(Connection conn, Player player) {
		PreparedStatement pstmt = null;
		String sql = "insert into player (name, backnum, teamnum) values (?,?,(select num from team where name = ?))";
		
		int cnt = 0;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, player.getName());
			pstmt.setInt(2, player.getBacknum());
			pstmt.setString(3, player.getTeamname());
			
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
	
	// 선수 조회 (이름)
	public static List<Player> selectPlayerByName(Connection conn, String pname) {
		List<Player> playerList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select p.num, p.name, p.backnum, p.teamnum, t.name "
				+ "from player p join team t on p.teamnum = t.num where p.name = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pname);
			rs = pstmt.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					Integer num = rs.getInt(1);
					String name = rs.getString(2);
					Integer backnum = rs.getInt(3);
					Integer teamnum = rs.getInt(4);
					String teamname = rs.getString(5);
					playerList.add(new Player(num, name, backnum, teamnum, teamname));
				}
				
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
		
		return playerList;
	}
	
	// 선수 조회 (등번호)
	public static List<Player> selectPlayerByBacknum(Connection conn, Integer pbacknum) {
		List<Player> playerList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select p.num, p.name, p.backnum, p.teamnum, t.name "
				+ "from player p join team t on p.teamnum = t.num where p.backnum = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pbacknum);
			rs = pstmt.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					Integer num = rs.getInt(1);
					String name = rs.getString(2);
					Integer backnum = rs.getInt(3);
					Integer teamnum = rs.getInt(4);
					String teamname = rs.getString(5);
					playerList.add(new Player(num, name, backnum, teamnum, teamname));
				}
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

		return playerList;
	}

	// 선수 조회 (번호)
	public static List<Player> selectPlayerByNum(Connection conn, Integer pnum) {
		List<Player> playerList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select p.num, p.name, p.backnum, p.teamnum, t.name "
				+ "from player p join team t on p.teamnum = t.num where p.num = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, pnum);
			rs = pstmt.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					Integer num = rs.getInt(1);
					String name = rs.getString(2);
					Integer backnum = rs.getInt(3);
					Integer teamnum = rs.getInt(4);
					String teamname = rs.getString(5);
					playerList.add(new Player(num, name, backnum, teamnum, teamname));	
				}
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
		
		return playerList;
	}
	
	// 선수 조회 (팀)
	public static List<Player> selectPlayerByTeam(Connection conn, String teamname1) {
		List<Player> playerList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select p.num, p.name, p.backnum, p.teamnum, t.name "
				+ "from player p join team t on p.teamnum = t.num where t.name = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, teamname1);
			rs = pstmt.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					Integer num = rs.getInt(1);
					String name = rs.getString(2);
					Integer backnum = rs.getInt(3);
					Integer teamnum = rs.getInt(4);
					String teamname2 = rs.getString(5);
					playerList.add(new Player(num, name, backnum, teamnum, teamname2));	
				}
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
		
		return playerList;
	}
}
