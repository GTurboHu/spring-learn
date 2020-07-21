package com.gth.applicationcontext.constructorcircle;

/**
 * @Author: Hugt
 * @Date: 2020/7/21 22:29
 * @Description:
 */

public class CcB {

	private CcA ccA;

	public CcB(CcA ccA) {
		this.ccA = ccA;
	}

	public CcA getCcA() {
		return ccA;
	}
}
