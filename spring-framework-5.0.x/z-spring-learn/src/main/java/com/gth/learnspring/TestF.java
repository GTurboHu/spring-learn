package com.gth.learnspring;

/**
 * @Author: Hugt
 * @Date: 2020/6/24 21:34
 * @Description:
 */

public class TestF {
	private TestG testG;

	public TestF() {
	}

	public TestF(TestG testG) {
		this.testG = testG;
	}

	public TestG getTestG() {
		return testG;
	}

	public void setTestG(TestG testG) {
		this.testG = testG;
	}
}
