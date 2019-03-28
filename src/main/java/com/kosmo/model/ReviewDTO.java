package com.kosmo.model;

public class ReviewDTO {
	private int rvw_idx;
	private int rvw_mem_idx;
	private int rvw_hp_idx;
	private int rvw_score;
	private String rvw_content;
	private String rvw_regidate;
	private String mem_name;
	private String rvw_count;
	
	public ReviewDTO() {
	}
	

	public ReviewDTO(int rvw_idx, int rvw_mem_idx, int rvw_hp_idx, int rvw_score, String rvw_content,
			String rvw_regidate, String mem_name, String rvw_count) {
		super();
		this.rvw_idx = rvw_idx;
		this.rvw_mem_idx = rvw_mem_idx;
		this.rvw_hp_idx = rvw_hp_idx;
		this.rvw_score = rvw_score;
		this.rvw_content = rvw_content;
		this.rvw_regidate = rvw_regidate;
		this.mem_name = mem_name;
		this.rvw_count = rvw_count;
	}


	public int getRvw_idx() {
		return rvw_idx;
	}


	public void setRvw_idx(int rvw_idx) {
		this.rvw_idx = rvw_idx;
	}


	public int getRvw_mem_idx() {
		return rvw_mem_idx;
	}


	public void setRvw_mem_idx(int rvw_mem_idx) {
		this.rvw_mem_idx = rvw_mem_idx;
	}


	public int getRvw_hp_idx() {
		return rvw_hp_idx;
	}


	public void setRvw_hp_idx(int rvw_hp_idx) {
		this.rvw_hp_idx = rvw_hp_idx;
	}


	public int getRvw_score() {
		return rvw_score;
	}


	public void setRvw_score(int rvw_score) {
		this.rvw_score = rvw_score;
	}


	public String getRvw_content() {
		return rvw_content;
	}


	public void setRvw_content(String rvw_content) {
		this.rvw_content = rvw_content;
	}


	public String getRvw_regidate() {
		return rvw_regidate;
	}


	public void setRvw_regidate(String rvw_regidate) {
		this.rvw_regidate = rvw_regidate;
	}


	public String getMem_name() {
		return mem_name;
	}


	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}


	public String getRvw_count() {
		return rvw_count;
	}


	public void setRvw_count(String rvw_count) {
		this.rvw_count = rvw_count;
	}
	
	
	
	
	
	
}
