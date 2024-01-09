package com.springboot.SpringRest.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class CourseEntity {

	@Id
	private int course_no;
	private String course_name;
	private int course_hours;

	public int getCourse_no() {
		return course_no;
	}

	public void setCourse_no(int course_no) {
		this.course_no = course_no;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getCourse_hours() {
		return course_hours;
	}

	public void setCourse_hours(int course_hours) {
		this.course_hours = course_hours;
	}

	@Override
	public String toString() {
		return "CourseEntity [course_no=" + course_no + ", course_name=" + course_name + ", course_hours="
				+ course_hours + "]";
	}

	public CourseEntity(int course_no, String course_name, int course_hours) {
		super();
		this.course_no = course_no;
		this.course_name = course_name;
		this.course_hours = course_hours;
	}

	public CourseEntity() {
		super();

	}

}
