package com.traininginstitute.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "institutes")
public class Institute {
	@Id
	@Column(name = "inst_id")
	int inst_id;
	@Column(name = "inst_name")
	String Institute_name;
	@Column(name = "inst_password")
	String password;
	@Column(name = "aff_date")
	String affiliation_Date;
	@Column(name = "address")
	String Address;
	@Column(name = "inst_mail")
	String Institute_mail;
	public String getInstitute_mail() {
		return Institute_mail;
	}
	public void setInstitute_mail(String institute_mail) {
		Institute_mail = institute_mail;
	}
	public int getInst_id() {
		return inst_id;
	}
	public void setInst_id(int inst_id) {
		this.inst_id = inst_id;
	}
	@Column(name = "no_of_seats")
	int Number_of_seats;
	@Column(name = "no_of_courses")
	int number_of_course;
	public String getInstitute_name() {
		return Institute_name;
	}
	public void setInstitute_name(String institute_name) {
		Institute_name = institute_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAffiliation_Date() {
		return affiliation_Date;
	}
	public void setAffiliation_Date(String affiliation_Date) {
		this.affiliation_Date = affiliation_Date;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getNumber_of_seats() {
		return Number_of_seats;
	}
	public void setNumber_of_seats(int number_of_seats) {
		Number_of_seats = number_of_seats;
	}
	public int getNumber_of_course() {
		return number_of_course;
	}
	public void setNumber_of_course(int number_of_course) {
		this.number_of_course = number_of_course;
	}
}
