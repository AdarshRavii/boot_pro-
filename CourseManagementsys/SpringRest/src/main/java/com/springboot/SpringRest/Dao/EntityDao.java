package com.springboot.SpringRest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.SpringRest.Entity.CourseEntity;

public interface EntityDao extends JpaRepository<CourseEntity, Integer> {
	

}
