package com.kosmo.impl;

import java.util.ArrayList;

import com.kosmo.model.HospitalDTO;

public interface SearchHpImpl {

	// 진료과로 검색
	public ArrayList<HospitalDTO> searchHpType(String hp_type);
	// 병원이름으로 검색
	public ArrayList<HospitalDTO> searchHpName(String hp_name);
	// 야간진료병원 검색
	public ArrayList<HospitalDTO> searchHpNW(String type_search, String toggleNight, String toggleWeekend);
	// 주말진료병원 검색
	public ArrayList<HospitalDTO> searchHpWeekend(String type_search, String toggleWeekend);	
}
