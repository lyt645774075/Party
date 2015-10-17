package com.tianmai.party.support.utils;

import com.google.common.base.Preconditions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yangtao.lyt
 * @version $Id: DateUtil, v 0.1 2015-10-15 23:12 yangtao.lyt Exp $
 */
public class DateUtil {

    private final static String format = "yyyy-MM-dd HH:mm:ss";

    private final static SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);


    public static Date parseStr(String dateStr){
        Preconditions.checkNotNull(dateStr);

        try {
            return simpleDateFormat.parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException("时间解析异常", e);
        }
    }





}
