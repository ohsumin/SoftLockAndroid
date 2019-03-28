package com.kosmo.impl;

import java.util.ArrayList;
import java.util.List;

import com.kosmo.model.HospListDTO;
import com.kosmo.model.HospitalDTO;
import com.kosmo.model.ReservationDTO;
import com.kosmo.model.TreattimeDTO;

public interface HospitalImpl{
	//실시간검색
	public List<HospListDTO> searchHp(String searchStr);
	
	public List<HospListDTO> searchHp(HospListDTO hDto);
	
	// 병원회원 회원가입
    /*public ArrayList<HospitalDTO> hpjoinAction(String hp_id, String hp_pw, String hp_name, String hp_num, String hp_username, String hp_email, 
          String hp_phone, String hp_address);*/
	public void hpJoinAction(String hp_id, String hp_pw, String hp_name, String hp_num, String hp_username, String hp_email, 
	          String hp_phone, String hp_address, String hp_address2, String hp_type);
    
    // 회원아이디 중복여부 확인
    public int isUserId(String hp_id);
    
    // 회원 존재여부 확인
  	public int isUser(String id, String pw);
     
	//병원회원 로그인 추상메소드
	public HospitalDTO loginHp(String id, String pass);
	
	// 시큐리티로 로그인할때 로그인처리
	public HospitalDTO loginHpid(String id);
 
     //회원탈퇴 처리
   	public int delete(String mem_id);
   	
   	// 회원 허가여부
   	public String isPerm(String mem_id);
   	
   	//병원회원상세보기 읽기 및 수정 동시에 진행
   	public HospitalDTO viewModify(int hp_idx);
   	public ArrayList<TreattimeDTO> viewModifytime(int hp_idx);
   	
   	
   	//회원가입 시 treattime 테이블에 월~금 레코드 넣기
   	public void addTreatTime(int hp_idx, String treat_dy, String treat_open, String treat_close);
   	
   	//HOSPITAL 테이블 시간제외 넣기
   	public int modifyAction(int hp_idx, String hp_hpphone, String hp_night, String hp_detailInfo, String hp_etc, String originalName, String saveFileName);
   
   	//HOSPITAL 테이블 시간넣기
   	public void treatmodifyAction(int hp_idx, String dy, String dyopen, String dyclose);
   	
   	//게시물카운트
    public int getTotalCount(int resv_hp_idx);
    public ArrayList<ReservationDTO> listPage(int s, int e, int hp_idx);   
    public ReservationDTO reservView(String resv_idx);
    public int reservConf(String resv_idx);
    public int reservRej(String resv_idx);
    public int hp_resvDone(String resv_idx);
}
