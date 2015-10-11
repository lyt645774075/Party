package com.tianmai.party.domain;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * 团队业务对象
 *
 * @author yangtao.lyt
 * @version $Id: TeamBO, v 0.1 2015-10-09 19:11 yangtao.lyt Exp $
 */
public class TeamBO {

    //基本自描述性属性
    /**
     * 主键id
     */
    private Long id;
    /**
     * 名称
     */
    private Long name;
    /**
     * 描述
     */
    private Long desc;

    private Date gmtCreate;

    private Date gmtModified;

    private List<String> tagList;

    private String creatorName;

    private String creatorId;

    private Map<Long, String> adminMemberMap;

    private Map<Long, String> generalMemberMap;

    //资产总览
    /**
     * 总支出 （单位：分）
     */
    private Long totalExpenditure;
    /**
     * 总收入 （单位：分）
     */
    private Long totalIncome;

    //活动总览
    private Map<Long, String> activityMap;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getName() {
        return name;
    }

    public void setName(Long name) {
        this.name = name;
    }

    public Long getDesc() {
        return desc;
    }

    public void setDesc(Long desc) {
        this.desc = desc;
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

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
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

    public Map<Long, String> getActivityMap() {
        return activityMap;
    }



    public void setActivityMap(Map<Long, String> activityMap) {
        this.activityMap = activityMap;
    }

    public Map<Long, String> getAdminMemberMap() {
        return adminMemberMap;
    }

    public void setAdminMemberMap(Map<Long, String> adminMemberMap) {
        this.adminMemberMap = adminMemberMap;
    }

    public Map<Long, String> getGeneralMemberMap() {
        return generalMemberMap;
    }

    public void setGeneralMemberMap(Map<Long, String> generalMemberMap) {
        this.generalMemberMap = generalMemberMap;
    }
}
