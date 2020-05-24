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
		String s = "abc.java";
//		s = s.substring(1);
		System.out.println(s);
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("java"));

	}
}
