package com.kosmo.model;

public class HospListDTO {
	   
	   private int hosplist_idx;
	   private String hosplist_name;
	   private String hosplist_adrs;
	   
	   public HospListDTO() {}

	   public HospListDTO(int hosplist_idx, String hosplist_name, String hosplist_adrs) {
	      
	      this.hosplist_idx = hosplist_idx;
	      this.hosplist_name = hosplist_name;
	      this.hosplist_adrs = hosplist_adrs;
	   }

	   public int getHosplist_idx() {
	      return hosplist_idx;
	   }

	   public void setHosplist_idx(int hosplist_idx) {
	      this.hosplist_idx = hosplist_idx;
	   }

	   public String getHosplist_name() {
	      return hosplist_name;
	   }

	   public void setHosplist_name(String hosplist_name) {
	      this.hosplist_name = hosplist_name;
	   }

	   public String getHosplist_adrs() {
	      return hosplist_adrs;
	   }

	   public void setHosplist_adrs(String hosplist_adrs) {
	      this.hosplist_adrs = hosplist_adrs;
	   }

}