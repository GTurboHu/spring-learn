package com.gth.applicationcontext.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @Author: Hugt
 * @Date: 2020/7/18 13:37
 * @Description:
 */

public class TestEvent extends ApplicationEvent {
	private static final long serialVersionUID = 1L;

	public String msg;

	/**
	 * Create a new ApplicationEvent.
	 *
	 * @param source the object on which the event initially occurred (never {@code null})
	 */
	public TestEvent(Object source) {
		super(source);
	}

	public TestEvent(Object source,String msg) {
		super(source);
		this.msg = msg;
	}

	public void print(){
		System.out.println(msg);
	}

}


























