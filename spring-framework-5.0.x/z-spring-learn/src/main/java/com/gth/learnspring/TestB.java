package com.gth.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: Hugt
 * @Date: 2020/5/31 17:06
 * @Description:
 */

public class TestB {

	private TestC testC;
	private TestD testD;
	private List<TestE> testEList;

	public TestB() {
	}

	public TestC getTestC() {
		return testC;
	}

	public void setTestC(TestC testC) {
		this.testC = testC;
	}

	public TestD getTestD() {
		return testD;
	}

	public void setTestD(TestD testD) {
		this.testD = testD;
	}
}
