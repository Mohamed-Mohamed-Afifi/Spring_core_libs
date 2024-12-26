package com.global;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private int age;
	private Department depts;
//	private List<String> favs;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Department getDepts() {
		return depts;
	}
	public void setDepts(Department depts) {
		this.depts = depts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	public void test() {
//		System.out.println("Every this is ok !");
//		System.out.println(dept.getDname());
//
//	}
	
}
