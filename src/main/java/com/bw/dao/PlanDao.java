package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.bean.Plan;

public interface PlanDao {
	void addList(List<Plan> addList); 
	
	List<Plan> getAll(@Param("name")String name);

	Plan getOne(Integer id);
}
