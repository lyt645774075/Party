package com.tianmai.party.dal.dbobj;

import java.util.Date;

/**
 * @author yangtao.lyt
 * @version $Id: PeopleDO, v 0.1 2015-10-08 19:40 yangtao.lyt Exp $
 */
public class PeopleDO {

    private Long id;

    private String name;

    private Integer sex;

    private String phone;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public Integer getSex() {

        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
