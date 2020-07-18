package com.gth.applicationcontext.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Author: Hugt
 * @Date: 2020/7/18 13:35
 * @Description:
 */

public class TestListener implements ApplicationListener<TestEvent> {

//	@Override
//	public void onApplicationEvent(ApplicationEvent event) {
//		if (event instanceof ApplicationEvent){
//			TestEvent testEvent = (TestEvent) event;
//			testEvent.print();
//		}
//	}

	@Override
	public void onApplicationEvent(TestEvent event) {
		if (event instanceof ApplicationEvent){
//			TestEvent testEvent = (TestEvent) event;
//			testEvent.print();
			event.print();
		}
	}
}
