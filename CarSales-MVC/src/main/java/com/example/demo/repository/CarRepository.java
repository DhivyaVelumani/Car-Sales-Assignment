package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Car;

@Repository
public class CarRepository {

	@Autowired
	private JdbcTemplate template;
	
	public int addCar(Car entity) {
		
		SimpleJdbcInsert inserter=new SimpleJdbcInsert(template);
		
		inserter.withTableName("car").usingColumns("model","modelear","TravelKms","status","ownerName","ownerNumber");
		
		BeanPropertySqlParameterSource sql=new BeanPropertySqlParameterSource(entity);
		
		return inserter.execute(sql);
	}

	public List<Car> getAllCars(){
		
		String sql="select * from car";
		
		List<Car> custlist=template.query(sql, BeanPropertyRowMapper.newInstance(Car.class));
		
		return custlist;
	}
	
	public List<Car> getUnsoldCars(){
		
		String sql="select * from car where status='unsold'";
		
		List<Car> custlist=template.query(sql, BeanPropertyRowMapper.newInstance(Car.class));
		
		return custlist;
	}
}

