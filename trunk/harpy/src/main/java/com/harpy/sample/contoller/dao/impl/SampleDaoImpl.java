package com.harpy.sample.contoller.dao.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.harpy.sample.contoller.dao.SampleDao;
import com.harpy.support.spring.HarpySqlSessionDaoSupport;

@Repository("sampleDao")
public class SampleDaoImpl extends HarpySqlSessionDaoSupport implements SampleDao{

	static final Logger log = LoggerFactory.getLogger(SampleDaoImpl.class);
	
	public List<Map<String, Object>> selectSampleList(Map<String, Object> params) {
		return getSqlSession().selectList("selectSampleList", params);
	}

	public int deleteSample(Map<String, Object> params) {
		return getSqlSession().delete("deleteSample", params);
	}
	
	public int insertSample(Map<String, Object> params) {
		return getSqlSession().insert("insertSample", params);
	}

}