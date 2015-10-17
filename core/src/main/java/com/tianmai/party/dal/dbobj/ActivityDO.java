package com.tianmai.party.dal.dbobj;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author yangtao.lyt
 * @version $Id: ActivityDO, v 0.1 2015-10-08 19:39 yangtao.lyt Exp $
 */
@Table(name = "activity")
@Entity
public class ActivityDO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date gmtCreate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date gmtModified;

    private String name;

    private String description;

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

    */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 费用结算策略
     * 是指，活动结束后，如果有多余费用，是否转为团队共享等形式
     *//*
    private Integer feeSettleStrategy;*/




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
