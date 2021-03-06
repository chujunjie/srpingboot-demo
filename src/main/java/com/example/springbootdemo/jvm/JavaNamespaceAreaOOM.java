package com.example.springbootdemo.jvm;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * @Description: 元空间内存溢出异常（借助CGLib代理实现） 配置参数： -XX:MaxMetaspaceSize=10M
 * @Author: chujunjie
 * @Date: Create in 14:55 2018/8/27
 * @Modified By
 */
public class JavaNamespaceAreaOOM {
    public static void main(String[] args) {
        for (;;) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> methodProxy.invoke(o,objects));
            enhancer.create();
        }
    }

    private static class OOMObject {
    }
}
