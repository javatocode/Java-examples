package com.spring.studentdao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import com.spring.operation.InsertData;
import com.spring.pojo.Student;

public class RowMapperImp implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// create rowmapper for fetch data 
		ApplicationContext context = InsertData.context;
		Student sd = context.getBean("student",Student.class);
		sd.setSid(rs.getInt(1));
		sd.setSname(rs.getString(2));
		sd.setSbranch(rs.getString(3));
		Map<String,String>  mMap = new HashMap<String,String>();
		mMap.put("city",rs.getString("city"));
		mMap.put("state",rs.getString("state"));
		mMap.put("zipcode",rs.getString("zipcode"));
		sd.getAddress().setInfo(mMap);
		return sd;
	}

}
