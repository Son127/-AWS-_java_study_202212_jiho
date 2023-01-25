package j23_database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import usermanagrment.entity.User;

public class UserInsert {

	private static DBConnectionMgr pool;

	public UserInsert() {
		pool = DBConnectionMgr.getInstance();
	}

	public int saveUser(User user) {
		int successCount = 0;
		String sql = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;

		try {
			connection = pool.getConnection(); // try,catch로 예외처리

			sql = "insert into user_mst\r\n" + "values (0, ?,?,?,?)";

			preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); // text 에디터
			preparedStatement.setString(1, user.getUsername()); // (0, ?,?,?,?) 1번 물음표에 username
			preparedStatement.setString(2, user.getPassword()); //
			preparedStatement.setString(3, user.getName());
			preparedStatement.setString(4, user.getEmail());
			// 적용된 행의 갯수 리턴
			successCount = preparedStatement.executeUpdate(); // insert,update,delete 명령 실행.

			resultSet = preparedStatement.getGeneratedKeys();

			while (resultSet.next()) {
				System.out.println("이번에 만들어진 user_id ket값" + resultSet.getInt(1));
				user.setUserId(resultSet.getInt(1));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return successCount;
	}

	public static int saveRoles(Map<String, Object> map) {
		int successCount = 0;
		String sql = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = pool.getConnection();
			List<Integer> roles = (List<Integer>) map.get("roles");
			User user = (User) map.get("user");

			sql = "insert into role_dlt values ";

			for (int i = 0; i < roles.size(); i++) {
				sql += "(0, ?, ?,)";
				if (i < roles.size() - 1) {
					sql += ",";
				}
			}

			preparedStatement = connection.prepareStatement(sql);

			for (int i = 0; i < roles.size(); i++) {
				preparedStatement.setInt((i * 2) + 1, roles.get(i));
				preparedStatement.setInt((i * 2) + 2, user.getUserId());
			}
			successCount = preparedStatement.executeUpdate();

		} catch (Exception e) {

		}

		return successCount;
	}

	public static void main(String[] args) {
		UserInsert userInsert = new UserInsert();

		User user = User.builder()
				.username("eee")
				.password("1234")
				.name("eee")
				.email("eee@gmail.com")
				.build();
		
		int successCount = userInsert.saveUser(user);

		System.out.println("쿼리 실행 성공: " + successCount + "건");

		System.out.println(user);

		/* =================================================== */

		List<Integer> rolesIdList = new ArrayList<>();
		rolesIdList.add(1);
		rolesIdList.add(2);

		Map<String, Object> map = new HashMap<>();
		map.put("user", user);
		map.put("roles", rolesIdList);

		System.out.println(map);

		successCount = userInsert.saveRoles(map);

		int listSize = 3;

		String sql = "insert into test values";
		String values = "(0,?,?)";

		for (int i = 0; i < listSize; i++) {
			sql += values;
			if (i < listSize - 1) {
				sql += ",";
			}
		}
		System.out.println(sql);
		System.out.println("쿼리 실행 성공: " + successCount + "건");

	}

}
