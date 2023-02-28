package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel")
public class HotelManagement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Reg_No")
	private int regno;
	@Column(name = "First_Name")
	private String fname;
	@Column(name = "Last_Name")
	private String lname;
	@Column(name = "Check_In_Date")
	private String cid;
	@Column(name = "Check_Out_Date")
	private String cod;
	@Column(name = "No_Of_Rooms")
	private int nor;
	@Column(name = "No_Of_Persons")
	private int nop;
	@Column(name = "Phone_Number")
	private long phn;
	@Column(name = "Payment_Method")
	private String pm;

	public HotelManagement() {
	}

	public HotelManagement(int regno, String fname, String lname, String cid, String cod, int nor, int nop, long phn,String pm) {
		super();
		this.regno = regno;
		this.fname = fname;
		this.lname = lname;
		this.cid = cid;
		this.cod = cod;
		this.nor = nor;
		this.nop = nop;
		this.phn = phn;
		this.pm=pm;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public int getNor() {
		return nor;
	}

	public void setNor(int nor) {
		this.nor = nor;
	}

	public int getNop() {
		return nop;
	}

	public void setNop(int nop) {
		this.nop = nop;
	}

	public long getPhn() {
		return phn;
	}

	public void setPhn(long phn) {
		this.phn = phn;
	}

	public String getPm() {
		return pm;
	}
	
	public void setPm(String pm) {
		this.pm = pm;
	}
}
