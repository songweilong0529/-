package com.bw.test;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bw.bean.Department;
import com.bw.bean.Plan;
import com.bw.service.PlanService;
import com.bw.utils.StreamUtil;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class DemoTest {
	@Autowired
    private	PlanService pd;
	
	@Test
   public void test() {
	InputStream in = DemoTest.class.getResourceAsStream("/good.txt");
    List<String> list = StreamUtil.readLine(in);
    List<Plan> addList=new ArrayList<Plan>();
    for (String s : list) {
		Plan p=new Plan();
		String[] ss = s.split("\\|\\|");
		p.setName(ss[0]);
		p.setAmount(BigDecimal.valueOf(Double.parseDouble(ss[1])));
	    p.setContent(ss[2]);
	    p.setManager(ss[3]);
	    Department de=new Department();
	    switch (ss[4]) {
		case "炸药厂":
			de.setId(1);
			break;
		case "准能选煤厂":
			de.setId(2);
			break;
		case "洗选车间":
			de.setId(3);
			break;
		case "生产服务中心":
			de.setId(4);
			break;
		case "矸电公司":
			de.setId(5);
			break;
		case "大准铁路公司":
			de.setId(6);
			break;
		}
	    p.setD(de);
	    addList.add(p);
       }
       pd.addList(addList);
	}
}
