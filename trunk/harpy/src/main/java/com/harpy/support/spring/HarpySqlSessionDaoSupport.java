package com.harpy.support.spring;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * 
 * @author hycho Spring-mybatis 1.2.0 issue, get out @autowired... So create
 *         BaseSqlSessionDaoSupport class extends SqlSessionDaoSupport You use
 *         Mybatis for use SqlSessionDaoSupport class
 */

public abstract class HarpySqlSessionDaoSupport extends SqlSessionDaoSupport {

	@Resource(name = "sqlSession")
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
}
