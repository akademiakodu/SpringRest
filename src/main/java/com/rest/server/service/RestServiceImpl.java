package com.rest.server.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.rest.server.entity.User;

public class RestServiceImpl implements RestService {
	@Value("${user.email:nomail}")
	private String userEmail;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	@Override
	public String getResponse() {
		return "hello!";
	}
	
	
	@Override
	public List<User> getUsers() {
		return jdbcTemplate.query("select * from Users", new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new User(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
			}
		});
//				(rs, rowNum) -> new User(rs.getInt("id"), rs.getString("name"), rs.getString("email")));
	}
	
	
	@Override
	public void addUser() {
		jdbcTemplate.execute("insert into Users values (1, 'x', '" + userEmail + "')");
	}
	
}
