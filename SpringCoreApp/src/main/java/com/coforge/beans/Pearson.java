package com.coforge.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pearson {

	private int age;
	private String name;
	
@Autowired
	private Address add;
	
	public Pearson() {
		super();
	}
	
	
	public Pearson(int age, String name, Address add) {
		super();
		this.age = age;
		this.name = name;
		this.add = add;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	
}
