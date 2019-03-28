package com.kosmo.impl;

import java.util.ArrayList;

import com.kosmo.model.ReviewDTO;

public interface ReviewImpl {
	public void reviewinsert(String rvw_mem_idx, String rvw_hp_idx, String rvw_score, String comment);
	public ArrayList<ReviewDTO> reviewView(String rvw_hp_idx);
}
