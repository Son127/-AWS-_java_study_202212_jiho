package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.CountDownLatch;

import usermanagrment.entity.User;

public class UserSelect {
	
	private DBConnectionMgr pool;
	
	public UserSelect() {
		pool = DBConnectionMgr.getInstance();
	}
	
	public User findUserByUsername(String username) { // 메소드를 호출하면 user을 리턴
		User user = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
		
			con = pool.getConnection();
			
			String spl = "select user_id, username, userpassword, name, email from user_mst where username = ?";
			pstmt = con.prepareStatement(spl);
			pstmt.setString(1, username);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = User.builder()
						.userId(rs.getInt(1))
						.username(rs.getString(2))
						.password(rs.getString(3))
						.name(rs.getString(4))
						.email(rs.getString(5))
						.build();
			}
		
		} catch (Exception e) {

			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return user;
	}
	
	public static void main(String[] args) {
		
		UserSelect userSelect = new  UserSelect();
		
		User user = userSelect.findUserByUsername("aaab");
		
		System.out.println(user);
		
	}

}
