package com.gth.learnspring;

import com.gth.applicationcontext.TestACBean;
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


}
