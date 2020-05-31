package com.gth.learnspring;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
		//"car"前面不加"&"代表获取Car这个类，而不是CarFactoryBean
		Car bean = (Car) bf.getBean("car");
		System.out.println(bean.getBrand());
		System.out.println(bean.getMaxSpeed());
		System.out.println(bean.getPrice());
		//"&car"前面加上"&"代表要获取CarFactoryBean这个类
		CarFactoryBean carFactoryBean = (CarFactoryBean) bf.getBean("&car");
		System.out.println(carFactoryBean);
	}
	@Test(expected= BeanCurrentlyInCreationException.class)
	public void testCircleByConstructor() throws Throwable {
		try{
			new ClassPathXmlApplicationContext("BeanFactoryTest.xml");
		}catch(Exception e){
			//因为要在创建testC时抛出
			Throwable e1 = e.getCause().getCause().getCause();
			throw e1;
		}

	}

}
