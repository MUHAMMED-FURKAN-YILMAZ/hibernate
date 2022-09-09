package com.hb01.annotations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

// Ctrl+Shift+O -> annotation'i yazdiktna sonra otomatik import etmek icin kullanilir 
// Ctrl+space -> var olan secenekleri gosterir

// Bu annotation'i koydugumuz class database'de bir tablo'ya karsilik gelecek
@Entity

// Eger olusacak tablo ismini degistirmek istenirse name attribute ile bir tablo ismi verilir
@Table(name="t_student01") 

public class Student01 {
	
	// primary key olusmasini sagliyor
	@Id
//	@Column (name="std_id")
	private int id;

	// length default =255
	// nullable = true -> bu degere null girilebilir. defaultu nullable = true'dur
	// unique = false / default
	// Column annotation'i zorunlu degil ancak customize edebilmek icin gerekli
	@Column(name="student_name",length = 100, nullable = false, unique = false)
	private String name;
	
	// database tablosunda grade adinda bir kolon OLUSTURULMAZ
	//@Transient
	private int grade;
	
	// large object ile buyuk boyutlu datalar tutulabilir
//	@Lob
//	private byte [] image;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student01 [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}


	
	
	
	
}
