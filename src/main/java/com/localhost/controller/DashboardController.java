package com.localhost.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.localhost.base.controller.BaseController;

@Controller
@RequestMapping("/dashboard")
public class DashboardController extends BaseController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String initPage() {
		
//		System.out.println(getPrincipal());
		return "dashboard";
	}

}
