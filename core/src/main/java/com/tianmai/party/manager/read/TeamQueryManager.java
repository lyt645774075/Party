package com.tianmai.party.manager.read;

import com.tianmai.party.domain.TeamBO;

/**
 * @author yangtao.lyt
 * @version $Id: TeamQueryManager, v 0.1 2015-10-10 00:02 yangtao.lyt Exp $
 */
public interface TeamQueryManager {


    TeamBO getTeamBOById(Long id);

}
