package com.gth.learnspring;

/**
 * @Author: Hugt
 * @Date: 2020/5/31 17:06
 * @Description:
 */

public class TestB {
	private TestC testC;

	public TestB(TestC testC) {
	}

	public void b(){
		testC.c();
	}
	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}
}
