package com.bw.dao;

import java.util.List;

import com.bw.bean.Plan;

public interface PlanDao {
	void addList(List<Plan> addList); 
	
	List<Plan> getAll(String name);
}
