package com.entity;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentMarks {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	int roll_no;
	@Column
	String name;
	@Column
	int m1;
	@Column
	int m2;
	@Column
	int m3;
	@Column
	int m4;

	public StudentMarks() {

	}

	public StudentMarks( String name, int m1, int m2, int m3, int m4) {
		super();
//		this.roll_no = roll_no;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public int getM4() {
		return m4;
	}

	public void setM4(int m4) {
		this.m4 = m4;
	}

	@Override
	public String toString() {
		return "StudentMarks [roll_no=" + roll_no + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3
				+ ", m4=" + m4 + "]";
	}

}