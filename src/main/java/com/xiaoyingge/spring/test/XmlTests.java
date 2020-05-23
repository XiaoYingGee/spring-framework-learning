package com.xiaoyingge.spring.test;

import com.xiaoyingge.spring.bean.BeanXml;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/23 0:47
 */
public class XmlTests {

    public static void main (String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("config/spring.xml");
        BeanXml hello = (BeanXml) classPathXmlApplicationContext.getBean("hello");
        System.out.println(hello.hello());
    }
}
