package com.tianmai.party.constants;

/**
 * @author yangtao.lyt
 * @version $Id: DomainRole, v 0.1 2015-10-19 14:24 yangtao.lyt Exp $
 */
public interface DomainRole {


    public static final Integer NONE = 0;

    //已申请
    public static final Integer APPLIED = 1;

    //成员
    public static final Integer MEMBER = 10;

    //管理员
    public static final Integer ADMIN = 11;

    //创始人
    public static final Integer CREATOR = 99;

}
