package com.kosmo.impl;

import java.util.ArrayList;

import com.kosmo.model.ReservationDTO;
import com.kosmo.model.TreattimeDTO;

public interface ResvImpl {
	
	public TreattimeDTO getTime(String hp_idx, String dy);
	
	public ArrayList<ReservationDTO> getResv(String hp_idx, String date);
	
	public void resvInsert(String hp_idx, int mem_idx, String resv_symp, String resv_req, String resv_date, String resv_time);

}
