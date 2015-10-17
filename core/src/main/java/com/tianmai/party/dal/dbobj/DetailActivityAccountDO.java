package com.tianmai.party.dal.dbobj;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author yangtao.lyt
 * @version $Id: DetailActivityAccountDO, v 0.1 2015-10-17 01:01 yangtao.lyt Exp $
 */
@Table(name = "detail_activity_account")
@Entity
public class DetailActivityAccountDO {
    @Id
    private Long id;

    private Date gmtCreate;

    private Long type;

    private String desc;

    private Long money;

    private Long activityId;

    private String actionPeopleName;

    private Long actionPeopleId;

    private String auditPeopleName;

    private String auditPeopleId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getActionPeopleName() {
        return actionPeopleName;
    }

    public void setActionPeopleName(String actionPeopleName) {
        this.actionPeopleName = actionPeopleName;
    }

    public Long getActionPeopleId() {
        return actionPeopleId;
    }

    public void setActionPeopleId(Long actionPeopleId) {
        this.actionPeopleId = actionPeopleId;
    }

    public String getAuditPeopleName() {
        return auditPeopleName;
    }

    public void setAuditPeopleName(String auditPeopleName) {
        this.auditPeopleName = auditPeopleName;
    }

    public String getAuditPeopleId() {
        return auditPeopleId;
    }

    public void setAuditPeopleId(String auditPeopleId) {
        this.auditPeopleId = auditPeopleId;
    }
}
