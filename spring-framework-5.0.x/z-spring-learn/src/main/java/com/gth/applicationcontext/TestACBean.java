package com.gth.applicationcontext;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @Author: Hugt
 * @Date: 2020/5/19 23:06
 * @Description:
 */

public class TestACBean implements BeanNameAware {
	private String testStr = "testStr";
	private String beanName;

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public String getBeanName() {
		return beanName;
	}
}
