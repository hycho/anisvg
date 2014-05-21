package com.harpy.repeat.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harpy.repeat.dao.RepeatDao;
import com.harpy.repeat.service.RepeatService;
import com.harpy.sample.service.SampleService;

@Service("repeatService")
public class RepeatServiceImpl implements RepeatService {

	@Resource(name = "repeatDao")
	private RepeatDao repeatDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<Map<String, Object>> selectRepeatList(Map<String, Object> params) throws Exception {
		return repeatDao.selectRepeatList(params);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int insertRepeat(Map<String, Object> params) throws Exception {
		return repeatDao.insertRepeat(params);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteRepeat(Map<String, Object> params) throws Exception {
		return repeatDao.deleteRepeat(params);
	}
}