package com.kosmo.model;

import java.sql.Date;

public class MemberDTO {

	private int mem_idx;
	private String mem_id;
	private String mem_pw;
	private String mem_name;
	private String mem_birth;
	private String mem_phone;
	private String mem_gender;
	private String mem_email;
	private java.sql.Date mem_regidate;
	private String mem_auth;
	
	public MemberDTO() {}
	
	public MemberDTO(int mem_idx, String mem_id, String mem_pw, String mem_name, String mem_birth, String mem_phone,
			String mem_gender, String mem_email, Date mem_regidate, String mem_auth) {
		super();
		this.mem_idx = mem_idx;
		this.mem_id = mem_id;
		this.mem_pw = mem_pw;
		this.mem_name = mem_name;
		this.mem_birth = mem_birth;
		this.mem_phone = mem_phone;
		this.mem_gender = mem_gender;
		this.mem_email = mem_email;
		this.mem_regidate = mem_regidate;
		this.mem_auth = mem_auth;
	}

	//getter/setter
	public int getMem_idx() {
		return mem_idx;
	}

	public void setMem_idx(int mem_idx) {
		this.mem_idx = mem_idx;
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_pw() {
		return mem_pw;
	}

	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getMem_birth() {
		return mem_birth;
	}

	public void setMem_birth(String mem_birth) {
		this.mem_birth = mem_birth;
	}

	public String getMem_phone() {
		return mem_phone;
	}

	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}

	public String getMem_gender() {
		return mem_gender;
	}

	public void setMem_gender(String mem_gender) {
		this.mem_gender = mem_gender;
	}

	public String getMem_email() {
		return mem_email;
	}

	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}

	public java.sql.Date getMem_regidate() {
		return mem_regidate;
	}

	public void setMem_regidate(java.sql.Date mem_regidate) {
		this.mem_regidate = mem_regidate;
	}

	public String getMem_auth() {
		return mem_auth;
	}

	public void setMem_auth(String mem_auth) {
		this.mem_auth = mem_auth;
	} 
	
	
	
	
	
	
	
	
}
