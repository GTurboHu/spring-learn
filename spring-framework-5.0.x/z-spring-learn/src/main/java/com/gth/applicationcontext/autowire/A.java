package com.gth.applicationcontext.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: Hugt
 * @Date: 2020/7/6 22:12
 * @Description:ApplicationContext，注解生效，如何让注解生效？？？？
 */

@Component("a")
public class A {
	/**
	 * ApplicationContext，注解生效，如何让注解生效？？？？
	 * @Autowired
	 * @Resource(name = "c")
	 * 两个注解都生效了
	 * 如何生效的，怎么注入的？？？？？
	 */
	@Autowired
	private B b;

	@Autowired
	private C c;

	@Resource(name = "d")
	private D d;

	@Resource(name = "e")
	private E e;


	public B getB() {
		return b;
	}

	public C getC() {
		return c;
	}
}
