package com.tianmai.party.dal.dbobj;

import java.util.Date;

/**
 * @author yangtao.lyt
 * @version $Id: TeamDO, v 0.1 2015-10-08 19:39 yangtao.lyt Exp $
 */
public class TeamDO {

    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private String name;

    private String description;

    private String tagListString;

    private Long creatorId;

    private String creatorName;



    private String adminList;

    /**
     * 总支出 （单位：分）
     */
    private Long totalExpenditure;
    /**
     * 总收入 （单位：分）
     */
    private Long totalIncome;


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

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTagListString() {
        return tagListString;
    }

    public void setTagListString(String tagListString) {
        this.tagListString = tagListString;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getAdminList() {
        return adminList;
    }

    public void setAdminList(String adminList) {
        this.adminList = adminList;
    }

    public Long getTotalExpenditure() {
        return totalExpenditure;
    }

    public void setTotalExpenditure(Long totalExpenditure) {
        this.totalExpenditure = totalExpenditure;
    }

    public Long getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Long totalIncome) {
        this.totalIncome = totalIncome;
    }



}
