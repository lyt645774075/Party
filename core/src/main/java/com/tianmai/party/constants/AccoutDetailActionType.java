package com.tianmai.party.constants;

import com.google.common.base.Preconditions;

/**
 * @author yangtao.lyt
 * @version $Id: AccoutDetailActionType, v 0.1 2015-10-09 19:45 yangtao.lyt Exp $
 */
public enum AccoutDetailActionType {


    JOININ_ACTIVITY(1,"参与活动"),

    DONATE_TEAM(2,"捐献团队"),

    TEAM_APPROPRIATION(3, "团队拨款"),



    ;


    private Integer code;

    private String desc;

    AccoutDetailActionType(Integer code, String desc){

        this.code = code;
        this.desc = desc;
    }

    public static AccoutDetailActionType getActionTypeByCode(Integer code){
        Preconditions.checkNotNull(code);

        for(AccoutDetailActionType type : values()){
            if(type.getCode().equals(code)){
                return type;
            }
        }

        throw new IllegalArgumentException("code is invalid!");
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
