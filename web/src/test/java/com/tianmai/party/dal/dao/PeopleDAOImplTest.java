package com.tianmai.party.dal.dao;

import com.tianmai.party.dal.dbobj.PeopleDO;
import com.tianmai.party.dal.query.PeopleQuery;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;

/**
 * @author yangtao.lyt
 * @version $Id: PeopleDAOImplTest, v 0.1 2015-10-08 20:35 yangtao.lyt Exp $
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-config.xml"})
public class PeopleDAOImplTest {

    @Resource


    @Test
    public void testInsertDO(){
        PeopleDO peopleDO = new PeopleDO();
        peopleDO.setName("testpeople");
        peopleDO.setSex(1);
        peopleDO.setPhone("18380315288");


        //Integer count = peopleDAO.insertDO(peopleDO);


    }

    @Test
    public void testQueryDOList(){
        PeopleQuery query = new PeopleQuery();
        query.setId(1L);

        //List<PeopleDO> peopleDOList = peopleDAO.queryDOList(query);

        Assert.isTrue(true);
    }




}