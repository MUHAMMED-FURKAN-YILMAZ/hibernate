package com.hb10.idgenerationstrategy;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book10 extends BaseEntity{

//	@Id
//	private int id;
	
	private String name;

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Book09 [id=" + getId() + ", name=" + name + "]";
	}
	
}
