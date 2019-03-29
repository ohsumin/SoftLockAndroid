package com.kosmo.impl;

import java.util.ArrayList;

import com.kosmo.model.HospitalDTO;
import com.kosmo.model.ReservationDTO;

public interface AndroidImpl {
	
	public void memjoinAction(String mem_id, String mem_pw, String mem_name, String mem_birth, 
			String mem_phone, String mem_gender, String mem_email, String mem_auth);
	
	public ArrayList<HospitalDTO> searchHp(HospitalDTO hDTO);
	
	public ArrayList<ReservationDTO> reservationPage(String resv_idx);
	
	public ArrayList<ReservationDTO> reservationPage2(int resv_idx);
	
	public ArrayList<HospitalDTO> clipRecordPage(int clip_mem_idx);
	
	public HospitalDTO getHpInfo(String hp_idx);
}
