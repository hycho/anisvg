package com.harpy.sample.contoller.service;

import java.util.List;
import java.util.Map;

/**
 * 샘플을 위한 서비스 인터페이스 클래스를 정의한다.
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
 *   2013.11.28  조호영.          최초 생성
 * 
 * </pre>
 */
public interface SampleService {

	/**
	 * 샘플을 저장한다.
	 * 
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public int insertSample(Map<String, Object> params) throws Exception;

	/**
	 * 검색조건에 따른 샘플의 리스트를 가져온다.
	 * 
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public List<Map<String, Object>> selectSampleList(Map<String, Object> params) throws Exception;

	/**
	 * 검색조건에 따라 샘플을 삭제 한다.
	 * 
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public int deleteSample(Map<String, Object> params) throws Exception;

}