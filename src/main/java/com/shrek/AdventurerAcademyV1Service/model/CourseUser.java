package com.shrek.AdventurerAcademyV1Service.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="COURSE_USER")
public class CourseUser extends BaseEntity implements Serializable{

	@OneToOne
	@JoinColumn(name = "USER_ID", referencedColumnName = "ID")
	private User userId;
	
	@OneToOne
	@JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
	private Course courseId;

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Course getCourseId() {
		return courseId;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}

	public CourseUser() {
		super();
	}

	public CourseUser(User userId, Course courseId) {
		super();
		this.userId = userId;
		this.courseId = courseId;
	}
	
}
