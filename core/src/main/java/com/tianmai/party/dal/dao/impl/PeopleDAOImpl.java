package com.tianmai.party.dal.dao.impl;

import com.tianmai.party.dal.dao.BaseDAO;
import com.tianmai.party.dal.dao.TemplateDAO;
import com.tianmai.party.dal.dbobj.PeopleDO;
import com.tianmai.party.dal.query.PeopleQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: PeopleDAOImpl, v 0.1 2015-10-08 19:46 yangtao.lyt Exp $
 */
@Repository
public class PeopleDAOImpl extends BaseDAO implements TemplateDAO<PeopleDO, PeopleQuery>{

    private static final String NAMESPACE = "PeopleDAOImpl.";

    public List<PeopleDO> queryDOList(PeopleQuery peopleQuery) {
        return getSqlSession().selectList(NAMESPACE + "queryDOList", peopleQuery);
    }

    public Integer insertDO(PeopleDO peopleDO) {
        return (Integer) getSqlSession().insert(NAMESPACE + "insertDO", peopleDO);
    }
}
