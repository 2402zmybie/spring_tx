package cn.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	/**
	 * 加钱
	 */
	public void addSalary() {
		String sql = "update account set salary = salary+? where username=?";
		jdbcTemplate.update(sql, "1000","小王");
	}
	
	public void decressSalary() {
		String sql = "update account set salary = salary+? where username=?";
		jdbcTemplate.update(sql, "-1000","小五");
	}
}
