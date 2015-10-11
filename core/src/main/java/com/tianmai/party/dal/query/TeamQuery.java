package com.tianmai.party.dal.query;

/**
 * @author yangtao.lyt
 * @version $Id: TeamQuery, v 0.1 2015-10-08 19:43 yangtao.lyt Exp $
 */
public class TeamQuery {

    private Long id;

    private Long creatorId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }
}
