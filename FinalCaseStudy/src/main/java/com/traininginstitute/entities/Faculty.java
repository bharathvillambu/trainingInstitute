package com.traininginstitute.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "faculty")
public class Faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "faculty_id")
	int faculty_id;
	@Column(name = "faculty_name")
	String faculty_name;
	@Column(name = "faculty_course")
	String course;
	@Column(name = "faculty_inst")
	String faculty_inst;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}
	public String getFaculty_name() {
		return faculty_name;
	}
	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
	}
	public String getFaculty_inst() {
		return faculty_inst;
	}
	public void setFaculty_inst(String faculty_inst) {
		this.faculty_inst = faculty_inst;
	}
}
