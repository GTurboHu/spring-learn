package com.gth.learnspring;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;


/**
 * @Author: Hugt
 * @Date: 2020/5/31 17:06
 * @Description:
 */

public class TestA {

	private String name;

	private TestB testB;

	public TestA() {
	}
	public TestA(TestB testB) {
	}
	public TestA(String name) {
		this.name = name;
	}
	public TestA(TestB testB,String name){
		this.name = name;
		this.testB = testB;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
