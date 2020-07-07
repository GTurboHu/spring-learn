package com.gth.learnspring.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Hugt
 * @Date: 2020/7/7 22:44
 * @Description:
 */

@Component("la")
public class LA {

	@Autowired
	private LB lb;

	public LB getLb() {
		return lb;
	}
}
