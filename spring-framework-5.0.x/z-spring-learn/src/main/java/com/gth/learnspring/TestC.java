package com.gth.learnspring;

import org.springframework.stereotype.Component;

/**
 * @Author: Hugt
 * @Date: 2020/5/31 17:06
 * @Description:
 */
@Component("testC")
public class TestC {
	private TestA testA;

	public TestC() {
	}

//	public TestC(TestA testA) {
//	}

	public void c(){
		testA.a();
	}
	public TestA getTestA() {
		return testA;
	}

	public void setTestA(TestA testA) {
		this.testA = testA;
	}
}
