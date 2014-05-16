package com.harpy.sample.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harpy.sample.dao.SampleDao;
import com.harpy.sample.service.SampleService;

/**
 * 일반회원관리에 관한비지니스클래스를 정의한다.
 * 
 * @author 조호영.
 * @since 2013.11.28
 * @version 0.1
 * @see
 * 
 *      <pre>
 * << 개정이력(Modification Information) >>
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2013.11.28  조호영          최초 생성
 * 
 * </pre>
 */
@Service("sampleService")
public class SampleServiceImpl implements SampleService {

	@Resource(name = "sampleDao")
	private SampleDao sampleDao;

	@Transactional(rollbackFor = Exception.class)
	public int insertSample(Map<String, Object> params) throws Exception {
		return sampleDao.insertSample(params);
	}

	@Transactional(rollbackFor = Exception.class)
	public List<Map<String, Object>> selectSampleList(Map<String, Object> params) throws Exception {
		return sampleDao.selectSampleList(params);
	}

	@Transactional(rollbackFor = Exception.class)
	public int deleteSample(Map<String, Object> params) throws Exception {
		return sampleDao.deleteSample(params);
	}

	@Transactional(rollbackFor = {Exception.class})
	public int testTransaction(Map<String, Object> params) throws Exception {
		sampleDao.insertSample(params);
		throw new Exception();
	}

}