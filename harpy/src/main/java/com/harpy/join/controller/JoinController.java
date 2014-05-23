package com.harpy.join.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JoinController {

	static final Logger log = LoggerFactory.getLogger(JoinController.class);
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() throws Exception {
		return "/join/join";
	}
}