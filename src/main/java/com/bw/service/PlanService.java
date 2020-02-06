package com.bw.service;

import java.util.List;

import com.bw.bean.Plan;

public interface PlanService {

	void addList(List<Plan> addList);

	Object getAll(Integer pageNum, String name);

	Plan getOne(Integer id);
     
}
