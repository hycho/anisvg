package com.harpy.sample.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

public interface SampleDao{

	static final Logger log = LoggerFactory.getLogger(SampleDao.class);
	
	public List<Map<String, Object>> selectSampleList(Map<String, Object> params);

	public int deleteSample(Map<String, Object> params);
	
	public int insertSample(Map<String, Object> params);

}