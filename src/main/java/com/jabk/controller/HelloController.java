package com.jabk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jabk.pojo.User;
import com.jabk.service.HelloService;


@Controller
public class HelloController {
	@Autowired
	private HelloService helloService;
	
	@RequestMapping("/findAll")
	public String fingAll(Model model) {
		List<User> userList =	helloService.findAll();
		//request域中
		model.addAttribute("userList", userList);
		return "userList";
	}	
		
		@RequestMapping("/Ajax")
		public String Ajax() {
			
			return "Ajax";
	}
	
	@RequestMapping("/ajaxFindUser")
	@ResponseBody	
	public List<User> ajaxFindUser(Integer id){
		System.out.println("获取参数:"+id);
		return helloService.findAll();
	} 	
}
