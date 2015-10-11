package com.tianmai.party.manager.read.impl;

import com.google.common.base.Preconditions;
import com.tianmai.party.dal.dao.TemplateDAO;
import com.tianmai.party.dal.dbobj.TeamDO;
import com.tianmai.party.dal.query.TeamQuery;
import com.tianmai.party.domain.TeamBO;
import com.tianmai.party.manager.read.TeamQueryManager;
import com.tianmai.party.support.transfer.TeamBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: TeamQueryManagerImpl, v 0.1 2015-10-10 00:07 yangtao.lyt Exp $
 */
@Service
public class TeamQueryManagerImpl implements TeamQueryManager {

    @Resource
    private TemplateDAO<TeamDO, TeamQuery> teamDAO;

    @Override
    public TeamBO getTeamBOById(Long id) {
        Preconditions.checkNotNull(id);

        TeamQuery query = new TeamQuery();
        query.setId(id);

        List<TeamDO> teamDOList = teamDAO.queryDOList(query);
        if(CollectionUtils.isEmpty(teamDOList)){
            return null;
        }

        TeamBuilder builder = new TeamBuilder();
        return builder.fromTeamDO(teamDOList.get(0)).build();
    }
}
