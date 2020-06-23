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
		//ClassPathResource类里边只存了文件的路径信息，类加载器，Class对象
		//ClassPathResource的getInputStream就是调用了类加载器或Class对象的方法
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("BeanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(bean.getTestStr());
		System.out.println(bean.getBeanName());
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

	@Test
	public void testABCBean(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("BeanFactoryTest.xml"));
		//"car"前面不加"&"代表获取Car这个类，而不是CarFactoryBean
		TestA testA = (TestA) bf.getBean("testA");
		TestB testB = (TestB) bf.getBean("testB");
		TestC testC = (TestC) bf.getBean("testC");

	}


	//@Test的expected参数代表期望报错的类型，如果报错正确，则通过测试
//	@Test(expected= BeanCurrentlyInCreationException.class)
	@Test
	public void testCircleByConstructor() throws Throwable {
		try{
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("BeanFactoryTest.xml");
			TestC testC = (TestC) ctx.getBean("testC");
			System.out.println(testC.getClass());
			System.out.println(testC.getTestA().getClass());
		}catch(Exception e){
			//因为要在创建testC时抛出
			Throwable e1 = e.getCause().getCause().getCause();
			throw e1;
		}
	}

}
