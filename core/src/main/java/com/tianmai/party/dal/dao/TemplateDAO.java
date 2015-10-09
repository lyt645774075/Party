package com.tianmai.party.dal.dao;

import java.util.List;

/**
 * @author yangtao.lyt
 * @version $Id: TemplateDAO, v 0.1 2015-10-08 20:03 yangtao.lyt Exp $
 */
public interface TemplateDAO <DBOBJECT,QUERY>{

    Integer count(QUERY query);

    List<?> queryFieldList(QUERY query);

    List<DBOBJECT> queryDOList(QUERY query);

    Integer insertDO(DBOBJECT dbobject);

    Integer updateDO(DBOBJECT dbobject);

    Integer deleteDO(DBOBJECT dbobject);




}
