package com.gth.learnspring;

import com.gth.applicationcontext.TestACBean;
import com.gth.applicationcontext.autowire.A;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
	public void testAnno() {
		ApplicationContext ac =
				new ClassPathXmlApplicationContext("application/AnnoAutowire.xml");
		A a = (A) ac.getBean("a");
		System.out.println(a);
		System.out.println(a.getB());
		System.out.println(a.getC());
	}


}
