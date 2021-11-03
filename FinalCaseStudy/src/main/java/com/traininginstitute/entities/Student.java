package com.traininginstitute.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stud")
public class Student {
	@Id
	@Column(name = "student_id")
	int student_id;
	@Column(name = "student_name")
	String student_name;
	@Column(name = "student_dob")
	String student_dob;
	@Column(name = "student_qual")
	String student_qual;
	@Column(name = "inst_name")
	String inst_name;
	@Column(name = "student_address")
	String student_address;
	@Column(name = "student_phno")
	String student_phno;
	@Column(name = "student_email")
	String student_email;
	@Column(name = "Userid")
	String Userid;
	@Column(name = "password")
	String password;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_dob() {
		return student_dob;
	}

	public void setStudent_dob(String student_dob) {
		this.student_dob = student_dob;
	}

	public String getStudent_qual() {
		return student_qual;
	}

	public void setStudent_qual(String student_qual) {
		this.student_qual = student_qual;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	public String getStudent_phno() {
		return student_phno;
	}

	public void setStudent_phno(String student_phno) {
		this.student_phno = student_phno;
	}

	public String getInst_name() {
		return inst_name;
	}

	public void setInst_name(String inst_name) {
		this.inst_name = inst_name;
	}

	public String getStudent_email() {
		return student_email;
	}

	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	public String getUserid() {
		return Userid;
	}

	public void setUserid(String userid) {
		Userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}