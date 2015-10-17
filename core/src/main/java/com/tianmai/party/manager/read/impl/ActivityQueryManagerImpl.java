package com.tianmai.party.manager.read.impl;

import com.tianmai.party.dal.dao.ActivityDAO;
import com.tianmai.party.dal.dao.DetailActivityAccountDAO;
import com.tianmai.party.dal.dbobj.ActivityDO;
import com.tianmai.party.dal.dbobj.DetailActivityAccountDO;
import com.tianmai.party.domain.ActivityBO;
import com.tianmai.party.domain.DetailActivityAccountBO;
import com.tianmai.party.manager.read.ActivityQueryManager;
import com.tianmai.party.support.objbuilder.ActivityBuilder;
import com.tianmai.party.support.objbuilder.CommonObjTransfer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: ActivityQueryManagerImpl, v 0.1 2015-10-12 20:11 yangtao.lyt Exp $
 */
@Service
public class ActivityQueryManagerImpl implements ActivityQueryManager{

    @Resource
    private ActivityDAO activityDAO;

    @Resource
    private DetailActivityAccountDAO detailActivityAccountDAO;



    @Override
    public ActivityBO getActivityBOById(Long id) {

        ActivityDO acitivityDO = activityDAO.findOne(id);

        ActivityBuilder builder = new ActivityBuilder();
        return builder.fromActivityDO(acitivityDO).build();

    }

    @Override
    public List<DetailActivityAccountBO> queryAccountBOListByActivityId(Long activityId) {
        List<DetailActivityAccountDO> doList = detailActivityAccountDAO.findAllByActivityId(activityId);

        return CommonObjTransfer.toBOList(doList);
    }
}
