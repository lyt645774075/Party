package com.tianmai.party.dal.dao.impl;

import com.tianmai.party.dal.dao.BaseDAO;
import com.tianmai.party.dal.dao.TemplateDAO;
import com.tianmai.party.dal.dbobj.ActivityDO;
import com.tianmai.party.dal.query.ActivityQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: ActivityDAOImpl, v 0.1 2015-10-09 23:19 yangtao.lyt Exp $
 */
@Repository
public class ActivityDAOImpl extends BaseDAO implements TemplateDAO<ActivityDO, ActivityQuery>{

    private static final String NAMESPACE = "ActivityDAOImpl";

    @Override
    public Integer count(ActivityQuery activityQuery) {
        return null;
    }

    @Override
    public List<?> queryFieldList(ActivityQuery activityQuery) {
        return null;
    }

    @Override
    public List<ActivityDO> queryDOList(ActivityQuery activityQuery) {
        return getSqlSession().selectList(NAMESPACE + "queryDOList", activityQuery);
    }

    @Override
    public Integer insertDO(ActivityDO activityDO) {
        return getSqlSession().insert(NAMESPACE + "insertDO", activityDO);
    }

    @Override
    public Integer updateDO(ActivityDO activityDO) {
        return null;
    }

    @Override
    public Integer deleteDO(ActivityDO activityDO) {
        return null;
    }
}
