package com.tianmai.party.support.transfer;

import com.tianmai.party.dal.dbobj.TeamDO;
import com.tianmai.party.domain.TeamBO;

/**
 * @author yangtao.lyt
 * @version $Id: TeamBuilder, v 0.1 2015-10-10 00:10 yangtao.lyt Exp $
 */
public class TeamBuilder {

    private TeamDO teamDO;

    public TeamBuilder fromTeamDO(TeamDO teamDO){
        this.teamDO = teamDO;
        return this;
    }


    public TeamBO build(){
        TeamBO teamBO = new TeamBO();

        return teamBO;
    }


}
