package com.tianmai.party.dal.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangtao.lyt
 * @version $Id: BaseDAO, v 0.1 2015-10-08 20:07 yangtao.lyt Exp $
 */
public abstract class BaseDAO extends SqlSessionDaoSupport{


    @Override
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

}
