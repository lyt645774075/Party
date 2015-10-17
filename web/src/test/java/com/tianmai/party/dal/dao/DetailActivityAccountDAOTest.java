package com.tianmai.party.dal.dao;

import com.tianmai.party.dal.dbobj.DetailActivityAccountDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: DetailActivityAccountDAOTest, v 0.1 2015-10-17 01:11 yangtao.lyt Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/persistence.xml",
                                    "classpath*:spring/beans/spring-dao.xml"})
public class DetailActivityAccountDAOTest {

    @Resource
    private DetailActivityAccountDAO detailActivityAccountDAO;

    @Test
    public void testFindAll(){

        List<DetailActivityAccountDO> allDO = detailActivityAccountDAO.findAll();
        Assert.isTrue(true);

    }


    @Test
    public void testFindOne(){

        DetailActivityAccountDO allDO = detailActivityAccountDAO.findOne(2L);
        Assert.isTrue(true);

    }

    @Test
    public void testFindByName(){

        DetailActivityAccountDO allDO = detailActivityAccountDAO.findByMoney(50000L);
        Assert.isTrue(true);



    }


}
