package com.gth.applicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @Author: Hugt
 * @Date: 2020/7/5 20:58
 * @Description:
 */

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	/**
	 * 在哪里应用的？beanDefiniton之前还是之后 ： 之后，所有beanDefinition已经全部加载完成
	 *
	 * 为什么只有一个方法postProcessBeanFactory
	 * 因为BeanFactoryPostProcessor有这个注解：@FunctionalInterface
	 * 这个注解代表可以当做lamda表达式传入，只能有一个方法
	 *
	 * BeanPostProcess有两个后处理方法：
	 * postProcessBeforeInitialization
	 * postProcessAfterInitialization
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println("BeanFactory后处理器："+beanDefinitionName);
		}
	}
}
