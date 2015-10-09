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

    private Date beginTime;

    private Date endTime;

    private Long creatorId;

    private String creatorName;

    private String tagListString;

    private Long entryFee;

    /**
     * 该活动哪些人可见（2进制）
     */
    private Integer canSee;

    /**
     * 该活动哪些人能够参与（2进制）
     */
    private Integer canJoin;

    /**
     * 费用结算策略
     * 是指，活动结束后，如果有多余费用，是否转为团队共享等形式
     */
    private Integer feeSettleStrategy;


}
