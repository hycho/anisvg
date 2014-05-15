package com.harpy.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
  static final Logger log = LoggerFactory.getLogger(HomeController.class);
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
	  log.info("Home Action Info Log Test");
	  log.debug("Home Action Debug Log Test");
	  log.error("Home Action Error Log Test");
	  
	  return "/index";
	}
}