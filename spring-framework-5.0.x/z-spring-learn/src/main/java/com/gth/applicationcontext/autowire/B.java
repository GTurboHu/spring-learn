package com.gth.applicationcontext.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Hugt
 * @Date: 2020/7/6 22:12
 * @Description:
 */
@Component("b")
public class B {

	@Autowired
	private C c;


}
