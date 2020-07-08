package com.gth.learnspring;

import com.gth.applicationcontext.TestACBean;
import com.gth.applicationcontext.autowire.A;
import com.gth.applicationcontext.autowire.B;
import com.gth.applicationcontext.config.ComponentScanConfig;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: Hugt
 * @Date: 2020/7/5 9:57
 * @Description:
 */

public class ClassPathXmlApplicationContextTest {

	@Test
	public void testSimpleLoad() {
		ApplicationContext ac =
				new ClassPathXmlApplicationContext("application/ApplicationContextTest.xml");
		TestACBean testACBean = (TestACBean) ac.getBean("testACBean");
		System.out.println(testACBean);
	}

	@Test
	public void testAnnotationConfig() {
		ApplicationContext ac =
				new ClassPathXmlApplicationContext("application/annotationconfig.xml");
		A a = (A) ac.getBean("a");
		System.out.println(a);
		System.out.println(a.getB());
		System.out.println(a.getC());
		B b = (B) ac.getBean("b");
		System.out.println(b);

	}

	@Test
	public void testComponentScan() {
		ApplicationContext ac =
				new ClassPathXmlApplicationContext("application/AnnoAutowire.xml");
		A a = (A) ac.getBean("a");
		System.out.println(a);
		System.out.println(a.getB());
		System.out.println(a.getC());

	}

	@Test
	public void testAnnoComponentScan() {
		// @Configuration注解的spring容器加载方式，用AnnotationConfigApplicationContext替换ClassPathXmlApplicationContext
		ApplicationContext ac = new AnnotationConfigApplicationContext(ComponentScanConfig.class);


		A a = (A) ac.getBean("a");
		System.out.println(a);
		System.out.println(a.getB());
		System.out.println(a.getC());

	}


	@Test
	public void testAnno() {
		ApplicationContext ac =
				new ClassPathXmlApplicationContext("application/AnnoAutowire.xml");
//		ApplicationContext采用注解好使，XmlBeanFactoy使用注解不好使，为什么？？？？
		A a = (A) ac.getBean("a");
		System.out.println(a);
		System.out.println(a.getB());
		System.out.println(a.getC());

		System.out.println("=============分割线====================");
		BeanFactory bf =
				new XmlBeanFactory(new ClassPathResource("application/AnnoAutowire.xml"));
//		ApplicationContext采用注解好使，XmlBeanFactoy使用注解不好使，为什么？？？？
		A a1 = (A) bf.getBean("a");
		System.out.println(a1);
		System.out.println(a1.getB());
		System.out.println(a1.getC());
	}


}
