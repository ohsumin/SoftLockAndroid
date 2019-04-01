package com.kosmo.impl;

import java.util.ArrayList;

import com.kosmo.model.HospitalDTO;
import com.kosmo.model.ReservationDTO;
import com.kosmo.model.TreattimeDTO;

public interface AndroidImpl {
	
	public void memjoinAction(String mem_id, String mem_pw, String mem_name, String mem_birth, 
			String mem_phone, String mem_gender, String mem_email, String mem_auth);
	
	public ArrayList<HospitalDTO> searchHp(HospitalDTO hDTO);
	
	public ArrayList<ReservationDTO> reservationPage(String resv_idx);//예약현황
	
	public ArrayList<ReservationDTO> reservationPage2(String resv_idx);//진료완료내역
	
	public ArrayList<HospitalDTO> clipRecordPage(int clip_mem_idx);//스크랩
	
		
	
	public void reserdelete(String resv_idx);//예약취소
	
	public ArrayList<TreattimeDTO> getHpTimeInfo2(String treat_hp_idx);//상세정보
	
	public HospitalDTO getHpInfo(String hp_name);
	
	public String getIdx(String hp_name);
	
	public void reservationAction(String hp_idx, String mem_idx, String resv_req, String resv_symp, 
	         String resv_date, String resv_time);//예ㅒ약
	
}
