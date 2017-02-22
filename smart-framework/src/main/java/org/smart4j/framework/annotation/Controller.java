package org.smart4j.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 控制器注解
 * Created by Administrator on 2017/2/22 0022.
 */
@Target(ElementType.TYPE)//标记此注解作用于 接口、类、枚举、注解
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
}
