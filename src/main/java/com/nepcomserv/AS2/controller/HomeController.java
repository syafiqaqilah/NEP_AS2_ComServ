package com.nepcomserv.AS2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value="/CommunityServiceOrg1")
	public String CommunityServiceOrg1() {
		return "CommunityServiceOrg1";
	}
	
	@RequestMapping(value="/CommunityServiceOrg2")
	public String CommunityServiceOrg2() {
		return "CommunityServiceOrg2";
	}
	
	@RequestMapping(value="/surveyForm")
	public String surveyForm() {
		return "surveyForm";
	}
	
	@RequestMapping(value="/indexPage")
	public String indexPage() {
		return "indexPage";
	}
	
	@RequestMapping(value="/formsent")
	public String formsent() {
		return "formsent";
	}
}
