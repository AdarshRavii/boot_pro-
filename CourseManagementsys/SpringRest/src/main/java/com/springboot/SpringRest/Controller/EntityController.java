package com.springboot.SpringRest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringRest.Entity.CourseEntity;
import com.springboot.SpringRest.Services.EntityService;

@RestController
public class EntityController {

	@Autowired
	private EntityService entityService;

	@GetMapping("/courses/{courseno}") // to get a single course from database
	public CourseEntity getCourse(@PathVariable String courseno) {

		return entityService.getCourse(Integer.parseInt(courseno));
	}

	@GetMapping("/courses") // to get all courses from database
	public List<CourseEntity> getAllCourse() {
		return entityService.getAllCourses();
		
	}
	
	@PostMapping("/courses")
	public CourseEntity addCourse(@RequestBody CourseEntity courseEntity)
	{
		return entityService.addCourse(courseEntity);
	}

	@PutMapping("/courses") // to update an existing course
	public CourseEntity updateCourse(CourseEntity courseEntity) {
		return entityService.updateCourse(courseEntity);
	}

	@DeleteMapping("/courses/{courseno}")//to delete an existing course 
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseno) {
		try {
			entityService.deleteCourse(Integer.parseInt(courseno));
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
