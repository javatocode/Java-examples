package com.spring.Jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.Jdbc.dao.StudentDao;
import com.spring.Jdbc.dao.StudentDaoImplement;

@Configuration
@ComponentScan(basePackages="com.spring.Jdbc.dao")
public class config {

	@Bean("ds")
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3307/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Lufa@7917");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
//	@Bean("studentdao")
//	public StudentDao getstudentdao() {
//		StudentDaoImplement studentdao = new StudentDaoImplement();
//		studentdao.setJdbcTemplate(getTemplate());
//		return studentdao;
//		}
}
