package org.smart4j.framework.proxy;

/**
 * 代理接口
 * Created by Administrator on 2017/2/27 0027.
 */
public interface Proxy {
    /**
     * 执行链式代理
     */
    Object doProxy(ProxyChain proxyChain)throws Throwable;
}
