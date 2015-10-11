package com.tianmai.party.dal.dao.impl;

import com.tianmai.party.dal.dao.BaseDAO;
import com.tianmai.party.dal.dao.TemplateDAO;
import com.tianmai.party.dal.dbobj.TeamDO;
import com.tianmai.party.dal.query.TeamQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: TeamDAOImpl, v 0.1 2015-10-09 23:14 yangtao.lyt Exp $
 */
@Repository
public class TeamDAOImpl extends BaseDAO implements TemplateDAO<TeamDO, TeamQuery>{

    private static final String NAMESPACE = "TeamDAOImpl.";


    @Override
    public Integer count(TeamQuery teamQuery) {
        return null;
    }

    @Override
    public List<?> queryFieldList(TeamQuery teamQuery) {
        return null;
    }

    @Override
    public List<TeamDO> queryDOList(TeamQuery teamQuery) {
        return getSqlSession().selectList(NAMESPACE + "queryDOList", teamQuery);
    }

    @Override
    public Integer insertDO(TeamDO teamDO) {
        return getSqlSession().insert(NAMESPACE + "insertDO", teamDO);
    }

    @Override
    public Integer updateDO(TeamDO teamDO) {
        return null;
    }

    @Override
    public Integer deleteDO(TeamDO teamDO) {
        return null;
    }
}
