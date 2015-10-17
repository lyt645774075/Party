package com.tianmai.party.manager.read.impl;

import com.tianmai.party.domain.TeamBO;
import com.tianmai.party.manager.read.TeamQueryManager;
import org.springframework.stereotype.Service;

/**
 * @author yangtao.lyt
 * @version $Id: TeamQueryManagerImpl, v 0.1 2015-10-10 00:07 yangtao.lyt Exp $
 */
@Service
public class TeamQueryManagerImpl implements TeamQueryManager {
    @Override
    public TeamBO getTeamBOById(Long id) {
        return null;
    }


    /*
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
    }*/
}
