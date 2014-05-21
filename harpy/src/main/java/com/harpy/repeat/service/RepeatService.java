package com.harpy.repeat.service;

import java.util.List;
import java.util.Map;

public interface RepeatService {

	public List<Map<String, Object>> selectRepeatList(Map<String, Object> params) throws Exception;
	
	public int insertRepeat(Map<String, Object> params) throws Exception;

	public int deleteRepeat(Map<String, Object> params) throws Exception;

}