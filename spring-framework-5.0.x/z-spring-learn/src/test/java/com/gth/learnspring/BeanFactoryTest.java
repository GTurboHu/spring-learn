package com.gth.learnspring;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


/**
 * @Author: Hugt
 * @Date: 2020/5/19 22:54
 * @Description:
 */

public class BeanFactoryTest {

	@Test
	public void testSimpleLoad(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("BeanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(bean.getTestStr());
	}

	@Test
	public void testFactoryBean(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("BeanFactoryTest.xml"));
		Car bean = (Car) bf.getBean("car");
		System.out.println(bean.getBrand());
		System.out.println(bean.getMaxSpeed());
		System.out.println(bean.getPrice());
	}
}
