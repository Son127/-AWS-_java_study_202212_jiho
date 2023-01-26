package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.management.relation.Role;

import com.mysql.cj.xdevapi.DbDoc;

public class RoleInsert {

	private DBConnectionMgr pool; // 전역변수 선언

	public RoleInsert() { // 싱글톤
		pool = DBConnectionMgr.getInstance();

	}

	public int saveRole(String roleName) {
		int successCount = 0;
		Connection con = null; // DB와 연결하기 위한 객체 JDBC라이브러리
		PreparedStatement pstmt = null;// 쿼리 실행
		String sql = null;
		ResultSet rs = null;
		// pool db에 들어가는 쿼리를 제한하는
		try {
			con = pool.getConnection(); // pool에서 connection을 가져옴

			sql = "insert into role_mst values (0,?)"; // java에서 db 문법 작성, 미완성된 sql을 pstmt에 전달

			pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);// DB상에 AUTO_INCREMENT로 인해 자동으로 생성되어진
																				// key(=id)를 가져오는 쿼리

			pstmt.setString(1, roleName);// 값을 집어 넣으면 set , 1번 인덱스에 String 을 대입

			successCount = pstmt.executeUpdate();// insert, delete, update 명령을 실행

			int newKey = 0;

			rs = pstmt.getGeneratedKeys(); //
			if (rs.next()) { // .next()는 다음행으로 내려가서 값이 있으면 true 없으면 false를 반환한다
				newKey = rs.getInt(1); // getInt(컬럼 열의 위치)
			}
			System.out.println(newKey != 0 ? "새로운 키값: " + newKey : "키가 생성되지 않음");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return successCount;
	}

	public static void main(String[] args) {

		RoleInsert insert = new RoleInsert();

		int successCount = insert.saveRole("ROLE_TESTER");
		System.out.println("insert 성공건수: " + successCount);

	}
}
