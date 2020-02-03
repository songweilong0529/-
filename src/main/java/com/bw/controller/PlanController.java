package com.bw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bw.service.PlanService;

@Controller
public class PlanController {

	@Autowired
	private PlanService service;
	
	@RequestMapping("PlanList.do")
	public String PlanList(Model m,Integer pageNum,String name) {
		m.addAttribute("page",service.getAll(pageNum,name));
		m.addAttribute("name",name);
		return "list";
	}
}
