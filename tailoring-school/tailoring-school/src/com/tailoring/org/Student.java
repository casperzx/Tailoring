package com.tailoring.org;

public class Student {

	private int id;
	private String firstName;
	private String course;
	private String email;

	public Student(String firstName, String course, String email) {
		this.firstName = firstName;
		this.course = course;
		this.email = email;
	}

	public Student(int id, String firstName, String course, String email) {
		this.id = id;
		this.firstName = firstName;
		this.course = course;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", course=" + course + ", email=" + email + "]";
	}	
}
