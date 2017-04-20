package org.smart4j.framework;

/**
 * 维护配置文件中相关的配置项名称
 * Created by Administrator on 2017/2/22 0022.
 */
public interface ConfigConstant {
    String CONFIG_FILE = "smart.propeties";
    String JDBC_DRIER = "smart.framework.jdbc.driver";
    String JDBC_URL = "smart.framework.jdbc.url";
    String JDBC_USERNAME = "smart.framework.jdbc.usernam";
    String JDBC_PASSWORD = "smart.framework.jdbc.password";
    String APP_BASE_PACKAGE = "smart.framework.app.base_package";
    String APP_JSP_PATH = "smart.framework.app.jsp_path";
    String APP_ASSET_PATH = "smart.framework.app.asset_path";
    String APP_UPLOAD_LIMIT = "smart.framework.app.upload_limit";
}
