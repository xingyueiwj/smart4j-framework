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
}
