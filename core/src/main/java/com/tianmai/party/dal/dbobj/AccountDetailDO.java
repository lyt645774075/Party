package com.tianmai.party.dal.dbobj;

import java.util.Date;

/**
 * @author yangtao.lyt
 * @version $Id: AccountDetailDO, v 0.1 2015-10-08 19:41 yangtao.lyt Exp $
 */
public class AccountDetailDO {

    private Long id;
    private Date gmtCreate;

    /**
     * people, team , activity
     */
    private Long actionObjectId;
    private String actionObjectType;


    private Integer actionType;
    private String remark;





}
