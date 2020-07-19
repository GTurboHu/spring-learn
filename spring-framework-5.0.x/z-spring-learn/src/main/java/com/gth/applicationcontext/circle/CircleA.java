package com.gth.applicationcontext.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Hugt
 * @Date: 2020/7/19 9:43
 * @Description:
 */

@Component("circleA")
public class CircleA {

	@Autowired
	private CircleB circleB;

	public CircleB getCircleB() {
		return circleB;
	}
}
