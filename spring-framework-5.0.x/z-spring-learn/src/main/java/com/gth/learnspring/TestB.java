package com.gth.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Hugt
 * @Date: 2020/5/31 17:06
 * @Description:
 */
@Component
public class TestB {
	@Autowired
	private TestC testC;

	public TestB() {
	}

//	public TestB(TestC testC) {
//	}

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
