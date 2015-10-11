package com.tianmai.party.constants;

import com.google.common.base.Preconditions;

/**
 * @author yangtao.lyt
 * @version $Id: SexType, v 0.1 2015-10-09 19:58 yangtao.lyt Exp $
 */
public enum SexType {

    FEMALE(0, "女"),

    MALE(1, "男")

    ;

    private Integer code;

    private String  desc;

    SexType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static SexType getSexTypeByCode(Integer code) {
        Preconditions.checkNotNull(code);

        for (SexType type : values()) {
            if (type.getCode().equals(code)) {
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
