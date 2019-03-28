package com.kosmo.model;


public class ReservationDTO {
   private int resv_idx;
   private int resv_hp_idx;
   private int resv_mem_idx;
   private String resv_symp;
   private String resv_req;
   private String resv_date;
   private String resv_time;
   private String resv_perm;
   private String resv_regidate;
   private String hp_name; //병원이름
   private String mem_name;
   private String mem_birth;
   private String mem_phone;
   private String mem_gender;
   private int virtualNum;//가상번호컬럼 추가
   private String mem_email;
   private String mem_id;
   
   public ReservationDTO() {
		
	}
	   
   
   public ReservationDTO(int resv_idx, int resv_hp_idx, int resv_mem_idx, String resv_symp, String resv_req,
			String resv_date, String resv_time, String resv_perm, String resv_regidate, String hp_name, String mem_name,
			String mem_birth, String mem_phone, String mem_gender, int virtualNum, String mem_email, String mem_id) {
		super();
		this.resv_idx = resv_idx;
		this.resv_hp_idx = resv_hp_idx;
		this.resv_mem_idx = resv_mem_idx;
		this.resv_symp = resv_symp;
		this.resv_req = resv_req;
		this.resv_date = resv_date;
		this.resv_time = resv_time;
		this.resv_perm = resv_perm;
		this.resv_regidate = resv_regidate;
		this.hp_name = hp_name;
		this.mem_name = mem_name;
		this.mem_birth = mem_birth;
		this.mem_phone = mem_phone;
		this.mem_gender = mem_gender;
		this.virtualNum = virtualNum;
		this.mem_email = mem_email;
		this.mem_id = mem_id;
	}
	   

	public int getResv_idx() {
		return resv_idx;
	}
	
	public void setResv_idx(int resv_idx) {
		this.resv_idx = resv_idx;
	}
	
	public int getResv_hp_idx() {
		return resv_hp_idx;
	}
	
	public void setResv_hp_idx(int resv_hp_idx) {
		this.resv_hp_idx = resv_hp_idx;
	}
	
	public int getResv_mem_idx() {
		return resv_mem_idx;
	}
	
	public void setResv_mem_idx(int resv_mem_idx) {
		this.resv_mem_idx = resv_mem_idx;
	}
	
	public String getResv_symp() {
		return resv_symp;
	}
	
	public void setResv_symp(String resv_symp) {
		this.resv_symp = resv_symp;
	}
	
	public String getResv_req() {
		return resv_req;
	}
	
	public void setResv_req(String resv_req) {
		this.resv_req = resv_req;
	}
	
	public String getResv_date() {
		return resv_date;
	}
	
	public void setResv_date(String resv_date) {
		this.resv_date = resv_date;
	}
	
	public String getResv_time() {
		return resv_time;
	}
	
	public void setResv_time(String resv_time) {
		this.resv_time = resv_time;
	}
	
	public String getResv_perm() {
		return resv_perm;
	}
	
	public void setResv_perm(String resv_perm) {
		this.resv_perm = resv_perm;
	}
	
	public String getResv_regidate() {
		return resv_regidate;
	}
	
	public void setResv_regidate(String resv_regidate) {
		this.resv_regidate = resv_regidate;
	}
	
	public String getHp_name() {
		return hp_name;
	}
	
	public void setHp_name(String hp_name) {
		this.hp_name = hp_name;
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
	
	public int getVirtualNum() {
		return virtualNum;
	}
	
	public void setVirtualNum(int virtualNum) {
		this.virtualNum = virtualNum;
	}
	
	public String getMem_email() {
		return mem_email;
	}
	
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	
	public String getMem_id() {
		return mem_id;
	}
	
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

   
  
}