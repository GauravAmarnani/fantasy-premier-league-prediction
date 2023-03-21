package ams.com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import ams.com.annotations.Dao;
import ams.com.utility.SQLUtility;

@Dao
public class PasswordDAOImpl implements PasswordDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	public Boolean checkIfPasswordIsCorrect(String userName, String rawPassword) {
		String sql = SQLUtility.PASSWORD_BY_USERNAME;
		String pass = (String) jdbcTemplate.queryForObject(sql, new Object[] { userName }, String.class);
		if(passwordEncoder.matches(rawPassword, pass)) 
			return true;
		return false;
	}

	public Boolean updatePassword(String userName, String password) {
		String sql = SQLUtility.UPDATE_PASSWORD;
		Integer result = jdbcTemplate.update(sql, password, userName);
		if (result == 1)
			return true;
		return false;
	}
}
