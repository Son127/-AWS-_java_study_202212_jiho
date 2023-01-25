package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.management.relation.Role;

import com.mysql.cj.xdevapi.DbDoc;

public class RoleInsert {
	
	private DBConnectionMgr pool; //전역변수 선언 
	
	public RoleInsert() { //RoleInsert가 생성이 될때마다  pool을 만들어라.
		pool = DBConnectionMgr.getInstance();
		
	}

	public int saveRole(String roleName) {
		int successCount = 0;
		Connection con = null; // DB와 연결하기 위한 객체
		PreparedStatement pstmt = null;//statement와 PreparedStatement는 데이터를 어떤식으로 바이딩하는가의 차이가 있다.
		String sql = null;
	
		try {
			con = pool.getConnection(); // pool에서 connection을 가져옴
			sql = "insert into role_mst values (0,?)"; // java에서 db 문법 작성
			pstmt = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);//DB상에 AUTO_INCREMENT로 인해 자동으로 생성되어진 key(=id)를 가져오는 쿼리
			pstmt.setString(1, roleName);
			
			successCount = pstmt.executeUpdate();//insert, delete, update 명령을 실행
			
			int newKey = 0;
			
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next()) {
				newKey = rs.getInt(1); 
			}
			System.out.println(newKey != 0 ? "새로운 키값: " + newKey : "키가 생성되지 않음");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return successCount;
	}

	public static void main(String[] args) {
		
		RoleInsert insert = new RoleInsert();
		
		int successCount =  insert.saveRole("ROLE_TESTER");
		System.out.println("insert 성공건수: " + successCount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

