package com.gth.learnspring;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;


/**
 * @Author: Hugt
 * @Date: 2020/5/31 17:06
 * @Description:
 */

public class TestA {

	@Autowired
	private TestB testB;

	@Resource(name = "testC")
	private TestC testC;

	public TestA() {
	}

//	public TestA(TestB testB) {
//	}

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
