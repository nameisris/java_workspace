import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver"); // driver 설정
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb", "root", "1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insertUser(String id, String name) {
		Connection conn = getConnection();
		String sql = String.format("insert into user (id,name) values ('%s','%s')", id,name) ;
		// DB로 SQL문을 전송하고, DB에서 처리된 결과를 Eclipse로 전달하는 역할을 하는 객체 Statement
		Statement stmt = null;
		
		try {
			// Statement 객체 생
			stmt = conn.createStatement();
			// 해당 SQL 문 실행에 영향을 받는 행 수를 반환
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 데이터 삽입");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void updateUser(String id, String name) {
		Connection conn = getConnection();
		String sql = String.format("update user set name = '%s' where id = '%s'", name, id) ;
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 데이터 수정");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void deleteUser(String id) {
		Connection conn = getConnection();
		String sql = String.format("delete from user where id = '%s'", id);
		Statement stmt = null;
		
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 데이터 삭제");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void userInfo(String id) {
		Connection conn = getConnection();
		String sql = String.format("select * from user where id = '%s'", id);
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			// SELECT문의 Query 결과를 가져오는 executeQuery
			rs = stmt.executeQuery(sql);
			
			if(rs != null && rs.next()) {
				// ResultSet 타입의 rs에서 String으로 가져옴 (SELECT문의 결과)
				String rid = rs.getString(1); // "id" 넣어도 됨
				String rname = rs.getString(2); // "name" 넣어도 됨
				System.out.println(rid + ", " + rname);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void allUserInfo() {
		Connection conn = getConnection();
		String sql = "select * from user";
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs != null) {
				while(rs.next()) {
					String rid = rs.getString("id");
					String rname = rs.getString("name");
					System.out.println(rid + ", " + rname);
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}

	public static void main(String[] args) {
		// insertUser("hong", "홍길동");
		// updateUser("song", "송송이");
		// deleteUser("song");
		// userInfo("song");
		allUserInfo();
	}

}
