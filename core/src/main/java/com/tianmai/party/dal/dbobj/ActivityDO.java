package com.tianmai.party.dal.dbobj;

import java.util.Date;

/**
 * @author yangtao.lyt
 * @version $Id: ActivityDO, v 0.1 2015-10-08 19:39 yangtao.lyt Exp $
 */
public class ActivityDO {


    private String id;

    private Date gmtCreate;

    private Date gmtModified;

    private String name;

    private String desc;

    private Integer enable;

    private Date beginTime;

    private Date endTime;

    private Long creatorId;

    private String creatorName;

    private String tagList;

    private Long entryFee;

    /**
     * 总支出 （单位：分）
     */
    private Long totalExpenditure;
    /**
     * 总收入 （单位：分）
     */
    private Long totalIncome;

    /**
     * 该活动哪些人可见（2进制）
    private Integer canSee;

    *//**
     * 该活动哪些人能够参与（2进制）
     *//*
    private Integer canJoin;

    *//**
     * 费用结算策略
     * 是指，活动结束后，如果有多余费用，是否转为团队共享等形式
     *//*
    private Integer feeSettleStrategy;*/


    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    public Long getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(Long entryFee) {
        this.entryFee = entryFee;
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
