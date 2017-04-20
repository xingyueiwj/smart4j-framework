package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public final class StringUtil {
    public static boolean isEmpty(String str){
        if (str != null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
    public static String[] splitString(String str,String param){
        if (str != null){
            str = str.trim();
        }
        return StringUtils.split(str,param);
    }
    /**
     * 字符串分隔符
     */
    public static final String SEPARATOR = String.valueOf((char)29);

}
