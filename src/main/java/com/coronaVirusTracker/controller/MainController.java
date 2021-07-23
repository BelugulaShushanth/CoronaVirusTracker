package com.coronaVirusTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coronaVirusTracker.Beans.DataBean;
import com.coronaVirusTracker.Services.CovidDataService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Controller
public class MainController {
	
	@Autowired
	private CovidDataService cds;
	
	@GetMapping("*")
	public String launchHomePage(Model model) throws JsonMappingException, JsonProcessingException {
		DataBean dataBean = cds.fetchCoronaVirusData();
		System.out.println(dataBean);
		model.addAttribute("dataBean", dataBean);
		return "HomePage";
	}
}
