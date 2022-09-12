package com.hb10.idgenerationstrategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.boot.model.IdGeneratorStrategyInterpreter.GeneratorNameDeterminationContext;

@Entity
public class Student10 extends BaseEntity {
	
	// BaseEntity'de @Id annotation'i oldugu icin artik asagidaki @Id'ye ihtiyac yok
//	@Id
//	@GeneratedValue --> AUTO'ya karsilik gelir
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
//	@GeneratedValue(strategy = GenerationType.TABLE)
	
//	@GeneratedValue(generator = "sequence", strategy = GenerationType.SEQUENCE)
//	@SequenceGenerator(name = "sequence",sequenceName = "student_seq",initialValue=1000, allocationSize = 10)

	//dd3f9408-2aa1-4f33-9dcb-011e876f813a
	//8-4-4-4-12=32*4=128 bit
//	@GeneratedValue(generator = "UUID")
//	@GenericGenerator(name = "UUID", strategy = "uuid2")
//	private String id;
//	private long id;


	@Column(name="student_name",nullable = false)
	private String name;
	
	private int grade;

//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
	
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}

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
		return "Student10 [id=" + getId() + ", name=" + name + ", grade=" + grade + "]";
	}
	
	
}
