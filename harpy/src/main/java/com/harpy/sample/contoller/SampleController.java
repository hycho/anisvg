package com.harpy.sample.contoller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.harpy.sample.contoller.service.SampleService;

@Controller
public class SampleController {

	static final Logger log = LoggerFactory.getLogger(SampleController.class);
	
	@Resource(name = "sampleService")
	private SampleService sampleService;

	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public String home() throws Exception {
		
		log.debug("!!!!!!!!!!!!!!!!!!");
		log.info("!!!!!!!!!!!!!!!!!!");
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("pid", "pid001");
		params.put("name", "name001");
		params.put("title", "title001");
		
		sampleService.insertSample(params);
		sampleService.selectSampleList(params);
		sampleService.deleteSample(params);
		
		return "/sample";
	}
}