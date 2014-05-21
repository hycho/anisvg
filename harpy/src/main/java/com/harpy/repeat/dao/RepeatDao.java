package com.harpy.repeat.dao;

import java.util.List;
import java.util.Map;

public interface RepeatDao{
	
	public List<Map<String, Object>> selectRepeatList(Map<String, Object> params);

	public int insertRepeat(Map<String, Object> params);
	
	public int deleteRepeat(Map<String, Object> params);

}