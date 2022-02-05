package com.cust.Cust.Model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity    // Entity Framework is an open-source ORM (Object Relational Mapping) Framework 
           // for the . NET applications supported by Microsoft
public class Cust {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int age;
	
	public Cust() {
		super();
	}

	public Cust(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Cust [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cust other = (Cust) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}
}
