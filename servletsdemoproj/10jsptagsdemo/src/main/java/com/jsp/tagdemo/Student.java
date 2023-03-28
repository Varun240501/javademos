package com.jsp.tagdemo;

public class Student {
	private String firstName;
	private String lastName;
	private boolean above90percent;
	
	public Student(String firstName, String lastName, boolean above90) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.above90percent = above90;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstname) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastname) {
		this.lastName = lastName;
	}
	public boolean isAbove90percent() {
		return above90percent;
	}
	public void setAbove90percent(boolean above90percent) {
		this.above90percent = above90percent;
	}

}
