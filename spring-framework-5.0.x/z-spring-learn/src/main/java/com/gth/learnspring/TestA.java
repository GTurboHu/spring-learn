package com.gth.learnspring;

/**
 * @Author: Hugt
 * @Date: 2020/5/31 17:06
 * @Description:
 */

public class TestA {
	private TestB testB;

	public TestA(TestB testB) {
	}

	public void a(){
		testB.b();
	}
	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}
}
