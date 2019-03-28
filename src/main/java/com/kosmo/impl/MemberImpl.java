package com.kosmo.impl;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.kosmo.model.HospitalDTO;
import com.kosmo.model.MemberDTO;
import com.kosmo.model.ReservationDTO;

public interface MemberImpl {
	
	// 일반회원 회원가입
	public void memjoinAction(String mem_id, String mem_pw, String mem_name, String mem_birth, 
			String mem_phone, String mem_gender, String mem_email);

	// 로그인 처리를 위한 추상메소드
	public MemberDTO login(String id, String pass);
	
	// 회원 존재여부 확인
	public int isUser(String id, String pw);
	
	// 회원아이디 중복여부 확인
	public int isUserId(String id);
	
	//수정하기 폼 진입
	public MemberDTO view(String mem_id);
	
	//수정하기 처리
	public int modifyAction(String mem_pw, String mem_phone, String mem_name, String mem_id);
	
	//회원탈퇴 처리
	public int delete(String mem_id);
	
	int GetKey(String mem_id, String mem_key); //유저 인증키 생성 메서드
	int alter_userKey(String mem_id, String key);// 유저 인증키 Y로 바꿔주는 메서드
	
	// 회원 이메일인증 여부
	public String isAuth(String mem_id);
	
	// 네이버회원 mem_auth를 y로 처리
	public void alter_naverKey(String mem_id);
	
	String searchId(@Param("mem_name")String mem_name, @Param("mem_phone")String mem_phone);

	public MemberDTO userInfo(String mem_id); // 유저 ID 찾기
	int searchPassword(String mem_id, String mem_email, String key); // 회원 임시 비밀번호 변경 메서드
	/***************************** 일반회원 마이페이지 ******************************/
	//멤버의 접수현황 레코드 갯수 카운트
	public int reserMemCount(int resv_mem_idx);
	public int reserCount(int resv_mem_idx);
	//start와 end를 파라미터로 받아 게시물 가져오기
	public ArrayList<ReservationDTO> reservationPage(int start, int end, int resv_idx);	
	public ArrayList<ReservationDTO> reserPage(int start, int end, int resv_idx);	
	//예약 삭제 처리하기
	public void reserdelete(String resv_idx);
	public ReservationDTO reservation(String resv_idx);
	/***************************** 일반회원 마이페이지 ******************************/

	/** 스크랩 **/
	public int ClipCheck(String clip_mem_idx,String clip_hp_idx);
	public void instClip(String clip_mem_idx,String clip_hp_idx);
	public void ClipDelete(String clip_mem_idx,String clip_hp_idx);
	public int clipRecordCount(int clip_mem_idx);
	public ArrayList<HospitalDTO> clipRecordPage(int start, int end, int clip_mem_idx);
	public void memClipDelete(String clip_mem_idx,String clip_hp_idx);
	/** 스크랩 **/

}
