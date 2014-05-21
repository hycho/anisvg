package com.harpy.repeat.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.harpy.repeat.service.RepeatService;
import com.harpy.utils.CommonUtil;

@Controller
public class RepeatController {

	static final Logger log = LoggerFactory.getLogger(RepeatController.class);
	
	@Resource(name = "repeatService")
	private RepeatService repeatService;
	
	@RequestMapping(value = "/repeatModal", method = RequestMethod.GET)
	public String repeatList() throws Exception {
		return "/repeat/repeatModal";
	}
	
	@RequestMapping(value = "/getRepeatList", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> getRepeatList(HttpServletRequest request) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> params = CommonUtil.transDataMap(request);
		
		List<Map<String, Object>> dataList = repeatService.selectRepeatList(params);
		
		result.put("data", dataList);
		
		return result;
	}
	
	@RequestMapping(value = "/insertRepeat", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> insertRepeat(HttpServletRequest request) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		Map<String, Object> params = CommonUtil.transDataMap(request);
		
		repeatService.insertRepeat(params);
		
		result.put("comment", "success");
		
		return result;
	}
	
	@RequestMapping(value = "/deleteRepeat", method = RequestMethod.POST)
	public void deleteRepeat(HttpServletRequest request) throws Exception {
		Map<String, Object> params = CommonUtil.transDataMap(request);
		repeatService.deleteRepeat(params);
	}
}