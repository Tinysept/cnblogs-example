package org.xs.demo1;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {

	@Autowired
	private testDao testDao;
	
	@RequestMapping("world")
	public String helloworld(HttpServletRequest request) {
		request.setAttribute("say", "Hello World!");
		return "index2";
	}
	
	@RequestMapping("mysql")
	public String mysql(HttpServletRequest request) {
		
		List<testInfo> list = testDao.getList();
		
		request.setAttribute("testList", list);
		request.setAttribute("say", "Hello Mysql!");
		
		return "index3";
	}
}
