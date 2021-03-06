package com.example.springbootdemo.aop;

import com.example.springbootdemo.spring.aop.AspectConfig;
import com.example.springbootdemo.spring.aop.Goods;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: chujunjie
 * @Date: Create in 22:46 2019/2/19
 * @Modified By
 */
public class AspectTest {

    private AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AspectConfig.class);

    @Test
    public void test01() {
        Goods goods = (Goods)applicationContext.getBean("goods");
        goods.cost(10, 2);
        goods.cost(10, 0);
    }
}
