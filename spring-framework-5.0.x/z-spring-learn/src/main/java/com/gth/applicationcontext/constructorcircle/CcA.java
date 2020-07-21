package com.gth.applicationcontext.constructorcircle;

/**
 * @Author: Hugt
 * @Date: 2020/7/21 22:29
 * @Description:
 */

public class CcA {

	private CcB ccB;

	public CcA(CcB ccB) {
		this.ccB = ccB;
	}


	public CcB getCcB() {
		return ccB;
	}
}
