package com.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
@Column
String name;
@Column 
int marks;
public student() {
	super();
	// TODO Auto-generated constructor stub
}
public student( String name, int marks) {
	super();
	
	this.name = name;
	this.marks = marks;
}
public int getId() {
	return id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}



}
