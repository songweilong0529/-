package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Plan;
import com.bw.dao.PlanDao;
import com.bw.utils.StringUtil;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.page.PageMethod;

@Service
public class PlanServiceImpl implements PlanService{
    
	@Autowired
	private PlanDao dao;
	@Override
	public void addList(List<Plan> addList) {
	 dao.addList(addList);		
	}
	@Override
	public Object getAll(Integer pageNum, String name) {
		if(pageNum==null) {pageNum=1;}
		if(!StringUtil.isNotEmpty(name)) {
			name="";
		}
		PageMethod.startPage(pageNum,5);
		return new PageInfo<Plan>(dao.getAll(name));
	}

}
