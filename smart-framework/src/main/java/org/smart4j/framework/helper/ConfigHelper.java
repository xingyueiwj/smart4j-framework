package org.smart4j.framework.helper;

import org.smart4j.framework.ConfigConstant;
import org.smart4j.framework.util.PropsUtil;

import java.util.Properties;

/**
 * 配置文件助手类,不可继承,保证类的唯一性
 * Created by Administrator on 2017/2/22 0022.
 */
public final class ConfigHelper {
    private static final Properties CONFIG_PROS = PropsUtil.loadProps(ConfigConstant.CONFIG_FILE);
    /**
     * 获取JDBC驱动
     */
    public static String getJdbcDriver(){
        return PropsUtil.getString(CONFIG_PROS,ConfigConstant.JDBC_DRIER);
    }
    /**
     * 获取JDBC URL
     */
    public static String getJdbcUrl(){
        return PropsUtil.getString(CONFIG_PROS,ConfigConstant.JDBC_URL);
    }
    /**
     * 获取JDBC 用户名
     */
    public static String getJdbcUserName(){
        return PropsUtil.getString(CONFIG_PROS,ConfigConstant.JDBC_USERNAME);
    }
    /**
     * 获取JDBC 密码
     */
    public static String getJdbcPassword(){
        return PropsUtil.getString(CONFIG_PROS,ConfigConstant.JDBC_PASSWORD);
    }
    /**
     * 获取应用基础包名
     */
    public static String getAppBasePackage(){
        return PropsUtil.getString(CONFIG_PROS,ConfigConstant.APP_BASE_PACKAGE);
    }
    /**
     * 获取JSP路径
     */
    public static String getAppJspPath(){
        return PropsUtil.getString(CONFIG_PROS,ConfigConstant.APP_JSP_PATH,"/WEB-INF/view/");
    }
    /**
     * 获取应用静态资源路径
     */
    public static String getAppAssetPath(){
        return PropsUtil.getString(CONFIG_PROS,ConfigConstant.APP_ASSET_PATH,"/asset/");
    }
}
