package com.ruicai.javaSE;

public class Student {
	private int Id;
	private String Name;
	
	public Student() {
		super();
		
	}

	public Student(int id, String name) {
		super();
		Id = id;
		Name = name;
		System.out.println(name+"---"+id);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	

}
