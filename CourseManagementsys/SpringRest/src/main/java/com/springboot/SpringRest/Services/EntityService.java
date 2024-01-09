package com.springboot.SpringRest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.SpringRest.Dao.EntityDao;
import com.springboot.SpringRest.Entity.CourseEntity;
@Component
public class EntityService {
	
	@Autowired
	private EntityDao entityDao;//this repo has all the methods needed for CRUD operations 
	
	//to get all courses from database
	public List<CourseEntity> getAllCourses()
	{
		return entityDao.findAll();
	}
	
	//to get a single course
	public CourseEntity getCourse(int course_no)
	{
		return entityDao.getById(course_no);
	}
	
	//to add a course
	public CourseEntity addCourse(CourseEntity courseEntity)
	{
		entityDao.save(courseEntity);
		return courseEntity;
	}
	
	//to update an existing course
	public CourseEntity updateCourse(CourseEntity courseEntity)
	{
		return entityDao.save(courseEntity);
		
	}
	
	//to delete an exisiting course
	@SuppressWarnings("deprecation")
	public void deleteCourse(int course_no)
	{
		CourseEntity course = entityDao.getById(course_no);
		entityDao.delete(course);
	}
	
}
