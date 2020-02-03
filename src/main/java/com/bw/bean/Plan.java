package com.bw.bean;

import java.math.BigDecimal;

public class Plan {
     private Integer id;
     private String name;
     private BigDecimal amount;
     private String manager;
     private String content;
     private Department d;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	public Plan() {
		super();
	}
	public Plan(Integer id, String name, BigDecimal amount, String manager, String content, Department d) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.manager = manager;
		this.content = content;
		this.d = d;
	}
    
     
}
