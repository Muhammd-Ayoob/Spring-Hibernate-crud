package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", city=" + city + "]";
	}

	@Id
	@Column(name="student_id")
	private int id;
	
	@Column(name="student_name")
	private String name;
	
	@Column(name="roll_no")
	private String rollNo;
	
	@Column(name="city")
	private String city;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rollNo
	 */
	public String getRollNo() {
		return rollNo;
	}

	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
