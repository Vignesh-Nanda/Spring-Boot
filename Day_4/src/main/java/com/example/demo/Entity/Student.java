package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Student_details")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "StudentName")
	private String SName;
	@Column(name = "DepartmentName")
	private String DName;
	@Column(name = "MailId")
	private String MId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String SName) {
		this.SName = SName;
	}
	public String getDName() {
		return DName;
	}
	public void setDName(String DName) {
		this.DName = DName;
	}
	public String getMId() {
		return MId;
	}
	public void setMId(String MId) {
		this.MId = MId;
	}
	public Student() {	};
	public Student(int id, String SName, String DName, String MId) {
		super();
		this.id = id;
		this.SName = SName;
		this.DName = DName;
		this.MId = MId;
	}

}
