package com.kosmo.model;

import java.sql.Date;

public class HospitalDTO {

   private int hp_idx; 
   private String hp_id;
   private String hp_pw;
   private String hp_name;
   private String hp_num;
   private String hp_username;
   private String hp_email;
   private String hp_phone;
   private String hp_address;
   private String hp_night;
   private String hp_wkend;
   private String hp_intro;
   private String hp_notice;
   private String hp_ori_filename;
   private String hp_perm;
   private java.sql.Date hp_regidate;  
   private String hp_hpphone;
   private String hp_address2;
   private String hp_type; // 진료과 추가
   private String hp_stored_filename;
   private int virtualNum; // 가상번호컬럼 추가
   private int score; // 점수 추가
   
   public HospitalDTO() {}

   public HospitalDTO(int hp_idx, String hp_id, String hp_pw, String hp_name, String hp_num, String hp_username,
         String hp_email, String hp_phone, String hp_address, String hp_night, String hp_wkend, String hp_intro,
         String hp_notice, String hp_ori_filename, String hp_perm, Date hp_regidate, String hp_hpphone,
         String hp_address2, String hp_type, String hp_stored_filename, int virtualNum, int score) {
      super();
      this.hp_idx = hp_idx;
      this.hp_id = hp_id;
      this.hp_pw = hp_pw;
      this.hp_name = hp_name;
      this.hp_num = hp_num;
      this.hp_username = hp_username;
      this.hp_email = hp_email;
      this.hp_phone = hp_phone;
      this.hp_address = hp_address;
      this.hp_night = hp_night;
      this.hp_wkend = hp_wkend;
      this.hp_intro = hp_intro;
      this.hp_notice = hp_notice;
      this.hp_ori_filename = hp_ori_filename;
      this.hp_perm = hp_perm;
      this.hp_regidate = hp_regidate;
      this.hp_hpphone = hp_hpphone;
      this.hp_address2 = hp_address2;
      this.hp_type = hp_type;
      this.hp_stored_filename = hp_stored_filename;
      this.virtualNum = virtualNum;
    }

   public int getScore() {
      return score;
   }
   
   public void setScore(int score) {
      this.score = score;
   }
   
   public int getHp_idx() {
      return hp_idx;
   }
   
   public void setHp_idx(int hp_idx) {
      this.hp_idx = hp_idx;
   }
   
   public String getHp_id() {
      return hp_id;
   }
   
   public void setHp_id(String hp_id) {
      this.hp_id = hp_id;
   }
   
   public String getHp_pw() {
      return hp_pw;
   }
   
   public void setHp_pw(String hp_pw) {
      this.hp_pw = hp_pw;
   }
   
   public String getHp_name() {
      return hp_name;
   }
   
   public void setHp_name(String hp_name) {
      this.hp_name = hp_name;
   }
   
   public String getHp_num() {
      return hp_num;
   }
   
   public void setHp_num(String hp_num) {
      this.hp_num = hp_num;
   }
   
   public String getHp_username() {
      return hp_username;
   }
   
   public void setHp_username(String hp_username) {
      this.hp_username = hp_username;
   }
   
   public String getHp_email() {
      return hp_email;
   }
   
   public void setHp_email(String hp_email) {
      this.hp_email = hp_email;
   }
   
   public String getHp_phone() {
      return hp_phone;
   }
   
   public void setHp_phone(String hp_phone) {
      this.hp_phone = hp_phone;
   }
   
   public String getHp_address() {
      return hp_address;
   }
   
   public void setHp_address(String hp_address) {
      this.hp_address = hp_address;
   }
   
   public String getHp_night() {
      return hp_night;
   }
   
   public void setHp_night(String hp_night) {
      this.hp_night = hp_night;
   }
   
   public String getHp_wkend() {
      return hp_wkend;
   }
   
   public void setHp_wkend(String hp_wkend) {
      this.hp_wkend = hp_wkend;
   }
   
   public String getHp_intro() {
      return hp_intro;
   }
   
   public void setHp_intro(String hp_intro) {
      this.hp_intro = hp_intro;
   }
   
   public String getHp_notice() {
      return hp_notice;
   }
   
   public void setHp_notice(String hp_notice) {
      this.hp_notice = hp_notice;
   }
   
   public String getHp_ori_filename() {
      return hp_ori_filename;
   }
   
   public void setHp_ori_filename(String hp_ori_filename) {
      this.hp_ori_filename = hp_ori_filename;
   }
   
   public String getHp_perm() {
      return hp_perm;
   }
   
   public void setHp_perm(String hp_perm) {
      this.hp_perm = hp_perm;
   }
   
   public java.sql.Date getHp_regidate() {
      return hp_regidate;
   }
   
   public void setHp_regidate(java.sql.Date hp_regidate) {
      this.hp_regidate = hp_regidate;
   }
   
   public String gethp_hpphone() {
      return hp_hpphone;
   }
   
   public void sethp_hpphone(String hp_hpphone) {
      this.hp_hpphone = hp_hpphone;
   }
   
   public String getHp_address2() {
      return hp_address2;
   }
   
   public void setHp_address2(String hp_address2) {
      this.hp_address2 = hp_address2;
   }
   
   public String getHp_type() {
      return hp_type;
   }
   
   public void setHp_type(String hp_type) {
      this.hp_type = hp_type;
   }
   
   public String getHp_stored_filename() {
      return hp_stored_filename;
   }
   
   public void setHp_stored_filename(String hp_stored_filename) {
      this.hp_stored_filename = hp_stored_filename;
   }
   
   public int getVirtualNum() {
      return virtualNum;
   }
   
   public void setVirtualNum(int virtualNum) {
      this.virtualNum = virtualNum;
   }
   
      
   
}