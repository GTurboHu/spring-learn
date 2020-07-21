package com.gth.learnspring;

/**
 * @Author: Hugt
 * @Date: 2020/7/21 22:39
 * @Description:
 */

public class TestI {

	private TestJ testJ;

	public TestI(TestJ testJ) {
		this.testJ = testJ;
	}

	public TestJ getTestJ() {
		return testJ;
	}
}
