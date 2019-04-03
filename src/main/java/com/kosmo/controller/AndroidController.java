package com.kosmo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kosmo.impl.AndroidImpl;
import com.kosmo.impl.MemberImpl;
import com.kosmo.model.HospitalDTO;
import com.kosmo.model.MemberDTO;
import com.kosmo.model.ReservationDTO;
import com.kosmo.model.TreattimeDTO;

@Controller
public class AndroidController {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	@RequestMapping("/Android/join")
	@ResponseBody
	public Map<String, Object> join(HttpServletRequest req, HttpSession session){
		System.out.println("진입!!!");
		
		String mem_id = req.getParameter("mem_id"); 
		String mem_pw = req.getParameter("mem_pw");
		String mem_name = req.getParameter("mem_name");
		String mem_phone = req.getParameter("mem_phone");
		String mem_gender = req.getParameter("mem_gender");
		String mem_email = req.getParameter("mem_email");
		String mem_birth_year = req.getParameter("mem_birth_year"); 
		String mem_birth_month =  req.getParameter("mem_birth_month");
		String mem_birth_day = req.getParameter("mem_birth_day");
		String mem_birth = mem_birth_year+mem_birth_month+mem_birth_day;
		String mem_auth = req.getParameter("mem_auth");
		
		System.out.println(mem_birth_year);
		System.out.println(mem_birth_month);
		System.out.println(mem_birth_day);
		System.out.println(mem_birth);
				
		Map<String, Object> map = new HashMap<String, Object>();

		// 회원가입여부 확인
		int isUser = sqlSession.getMapper(MemberImpl.class).isUserId(mem_id);
		// 만약 회원가입이 되어있지 않으면
		if(isUser != 1) {
			// 회원가입
			sqlSession.getMapper(AndroidImpl.class).memjoinAction(mem_id, mem_pw, mem_name, mem_birth, mem_phone, mem_gender, mem_email, mem_auth);
		} 	
		// 로그인
		MemberDTO vo = sqlSession.getMapper(MemberImpl.class).login(mem_id, mem_pw);
		session.setAttribute("memberInfo", vo);
		
		int mem_idx = ((MemberDTO)session.getAttribute("memberInfo")).getMem_idx();
		
		map.put("mem_idx", mem_idx);
		
		return map; 
	}
	
	@RequestMapping("/Android/searchHp")
	@ResponseBody
	public ArrayList<HospitalDTO> searchHp(HttpServletRequest req, HttpSession session){
		
		String hp_type = req.getParameter("hp_type");
		String hp_night = req.getParameter("hp_night");
		String hp_weekend = req.getParameter("hp_weekend");
		String hp_name = req.getParameter("hp_name");
		
		
		if(hp_type.equals("전체과목"))
			hp_type = "";
		if(hp_night.equals("")) 
			hp_night = "0";
		if(hp_weekend.equals(""))
			hp_weekend = "0";
		
		HospitalDTO hDTO = new HospitalDTO();
		hDTO.setHp_type(hp_type);
		hDTO.setHp_night(hp_night);
		hDTO.setHp_wkend(hp_weekend);
		hDTO.setHp_name(hp_name);
		
		System.out.println(hDTO.getHp_type());
		System.out.println(hDTO.getHp_night());
		System.out.println(hDTO.getHp_wkend());
		System.out.println(hDTO.getHp_name());
		
		System.out.println("searchHp호출");
		ArrayList<HospitalDTO> searchList = sqlSession.getMapper(AndroidImpl.class).searchHp(hDTO);
		session.setAttribute("hpInfo", searchList);
		for(int i=0; i<searchList.size(); i++) {
			System.out.println(searchList.get(i).getHp_idx()+"/"+searchList.get(i).getHp_name());
		}
	   		
		return searchList;
	}
	
	// 예약대기리스트
	@RequestMapping("/Android/reservationlist")
	@ResponseBody
	public ArrayList<ReservationDTO> reservationlist(Model model, HttpServletRequest req,
			HttpSession session) {
		System.out.println(" 아ㅣ아아아아");
		String resv_idx = req.getParameter("resv_idx");
		String mem_idx = req.getParameter("mem_idx");
		System.out.println(mem_idx);
		System.out.println(resv_idx);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		ArrayList<ReservationDTO> reservationDTO = sqlSession.getMapper(AndroidImpl.class).reservationPage(mem_idx);
		
	    map.put("resv_idx", resv_idx);
		
	    return reservationDTO;
	}
	
	//예약 삭제 처리
		@RequestMapping("/Android/reserdelete")
		@ResponseBody
		public void reserdelete(HttpServletRequest req,HttpServletResponse response) throws IOException {
			
			String resv_idx = req.getParameter("resv_idx");
			//String hp_name = req.getParameter("hp_name");
			//String resv_date = req.getParameter("resv_date");
			
			System.out.println("resv_idx="+resv_idx);
			//System.out.println("hp_name="+hp_name);
			//System.out.println("resv_date="+resv_date);
			
			//ReservationDTO rDTO = sqlSession.getMapper(MemberImpl.class).reservation(resv_idx);
			sqlSession.getMapper(AndroidImpl.class).reserdelete(resv_idx);
			
			

		}
	
	// 진료내역리스트
	@RequestMapping("/Android/reservationlist2")
	@ResponseBody
	public ArrayList<ReservationDTO> reservationlist2(Model model, HttpServletRequest req,
			HttpSession session) {
		System.out.println(" 아ㅣ아아아아");
		String mem_idx = req.getParameter("mem_idx");
		System.out.println(mem_idx);
		
		//Map<String, Object> map = new HashMap<String, Object>();
		
		ArrayList<ReservationDTO> reservationDTO = sqlSession.getMapper(AndroidImpl.class).reservationPage2(mem_idx);
		
	    //map.put("reservationDTO", reservationDTO);
		
	    return reservationDTO;
	}
	
	@RequestMapping("/Android/memberClip")
	@ResponseBody
	public ArrayList<HospitalDTO> memberClip(Model model, HttpServletRequest req,
			HttpSession session) {
		
		int mem_idx = ((MemberDTO)session.getAttribute("memberInfo")).getMem_idx();
		
		Map<String, Object> map = new HashMap<String, Object>();
		//회원정보 가져오기
		MemberDTO dto = sqlSession.getMapper(MemberImpl.class)
				.view(((MemberDTO)session.getAttribute("memberInfo")).getMem_id());
		model.addAttribute("dto", dto);
				
		
		ArrayList<HospitalDTO> HospitalDTO = sqlSession.getMapper(AndroidImpl.class).clipRecordPage(mem_idx);
		
		map.put("HospitalDTO", HospitalDTO);
		
		return HospitalDTO;
	}
	
	   /*//병원상세페이지 불러오기
	   @RequestMapping("/Android/info_hp")
	   @ResponseBody
	   public Map<String, Object> andInfoHp(HttpServletRequest req) {
	      String hp_idx = req.getParameter("hp_idx");
	      
	      HospitalDTO hDTO = sqlSession.getMapper(InfoHpImpl.class).getHpInfo(hp_idx);
	      Map<String, Object> info_hp = new HashMap<String, Object>();
	      
	      HospitalDTO hospitalDTO = new HospitalDTO();
	      hospitalDTO.setHp_name(hDTO.getHp_name());
	      hospitalDTO.setHp_address(hDTO.getHp_address());
	      hospitalDTO.setHp_address2(hDTO.getHp_address2());
	      hospitalDTO.setHp_phone(hDTO.getHp_phone());
	      hospitalDTO.setHp_intro(hDTO.getHp_intro());
	      hospitalDTO.setHp_notice(hDTO.getHp_notice());
	      
	      info_hp.put("HospitalDTO", hospitalDTO);
	      
	      
	      //TreattimeDTO tList = new TreattimeDTO();
	      ArrayList<TreattimeDTO> tDTO = sqlSession.getMapper(InfoHpImpl.class).getHpTimeInfo2(hp_idx);
	      info_hp.put("tDTO", tDTO);
	      
	      
	      
	      String[] treat_dy= {"월","화","수","목","금","토","일"};
	      //ArrayList<TreattimeDTO> tList = new ArrayList<TreattimeDTO>();
	      TreattimeDTO tList = new TreattimeDTO();
	      
	      for(int i = 0; i<treat_dy.length; i++) {
	         ArrayList<TreattimeDTO> tDTO = sqlSession.getMapper(InfoHpImpl.class).getHpTimeInfo(hp_idx, treat_dy[i]);
	         tList.setTreat_open(tDTO.get(i).getTreat_open());
	         info_hp.put("tList", tList);
	         System.out.println("sdfsf"+tDTO.get(i).getTreat_open());
	      }
	      
	      
	      return info_hp;
	   }*/
	   
	 //병원상세페이지 불러오기
	   @RequestMapping("/Android/info_hp")
	   @ResponseBody
	   public Map<String, Object> getHpTimeInfo2(HttpServletRequest req) {
		  System.out.println("info_hp진입");
	      String hp_name = req.getParameter("hp_name");
	      
	      String hpIdx = sqlSession.getMapper(AndroidImpl.class).getIdx(hp_name);
	      
	      Map<String, Object> info_hp = new HashMap<String, Object>();
	      
	      HospitalDTO hospitalDTO = sqlSession.getMapper(AndroidImpl.class).getHpInfo(hpIdx);
	      
	      info_hp.put("HospitalDTO", hospitalDTO); // 병원정보넣기
	    
	      ArrayList<TreattimeDTO> tDTO = sqlSession.getMapper(AndroidImpl.class).getHpTimeInfo2(hpIdx);
	      info_hp.put("tDTO", tDTO); // 시간넣기
	      
	      return info_hp;
	   }
}
