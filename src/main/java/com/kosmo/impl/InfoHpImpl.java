package com.kosmo.impl;

import java.util.ArrayList;

import com.kosmo.model.HospitalDTO;
import com.kosmo.model.MemberDTO;
import com.kosmo.model.ReviewDTO;
import com.kosmo.model.TreattimeDTO;

public interface InfoHpImpl {

	// 병원 회원정보 가져오기
	public HospitalDTO getHpInfo(String hp_idx);
	public ArrayList<TreattimeDTO> getHpTimeInfo(String treat_hp_idx, String treat_dy);
	public ArrayList<ReviewDTO> getHpReview(String hp_idx);
	public String getRvwCount(String hp_idx);
	public String getRvwAvg(String hp_idx);
	
	//통원 통계 그래프
	public ArrayList<MemberDTO> getCountAge(String hp_idx);
	public String getWNum(String hp_idx);
	public String getMNum(String hp_idx);
	//일반회원 메인 병원개수 및 예약개수 가져오기
/*	public String getNumHospital();
	public String getNumReserv();*/
}
