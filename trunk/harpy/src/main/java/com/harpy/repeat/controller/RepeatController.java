package com.harpy.repeat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RepeatController {

	static final Logger log = LoggerFactory.getLogger(RepeatController.class);
	
	@RequestMapping(value = "/repeatModal", method = RequestMethod.GET)
	public String login() throws Exception {
		return "/repeat/repeatModal";
	}
}