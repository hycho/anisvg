package com.harpy.repeat.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.harpy.repeat.dao.RepeatDao;
import com.harpy.support.spring.HarpySqlSessionDaoSupport;

@Repository("repeatDao")
public class RepeatDaoImpl extends HarpySqlSessionDaoSupport implements RepeatDao{

	@Override
	public List<Map<String, Object>> selectRepeatList(Map<String, Object> params) {
		return getSqlSession().selectList("repeatDao.selectRepeatList", params);
	}

	@Override
	public int insertRepeat(Map<String, Object> params) {
		return getSqlSession().insert("repeatDao.insertRepeat", params);
	}

	@Override
	public int deleteRepeat(Map<String, Object> params) {
		return getSqlSession().insert("repeatDao.deleteRepeat", params);
	}

}