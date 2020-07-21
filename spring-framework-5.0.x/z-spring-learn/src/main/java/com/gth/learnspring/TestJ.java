package com.gth.learnspring;

/**
 * @Author: Hugt
 * @Date: 2020/7/21 22:39
 * @Description:
 */

public class TestJ {

	private TestI testI;

	public TestJ(TestI testI) {
		this.testI = testI;
	}

	public TestI getTestI() {
		return testI;
	}
}
