package com.gth.learnspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @Author: Hugt
 * @Date: 2020/6/24 21:34
 * @Description:
 */

public class TestG implements BeanNameAware, BeanFactoryAware, BeanClassLoaderAware,
		EnvironmentAware, ApplicationContextAware {
	private String beanName;
	private BeanFactory beanFactory;
	private ClassLoader classLoader;
	private ApplicationContext applicationContext;
	private Environment environment;
	private String init;

	public void init(String init){
		this.init = init;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	public String getBeanName() {
		return beanName;
	}

	public BeanFactory getBeanFactory() {
		return beanFactory;
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public ClassLoader getClassLoader() {
		return classLoader;
	}

	public void setClassLoader(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public Environment getEnvironment() {
		return environment;
	}

	private void init() {
		this.init = "用户自定义初始化";
	}

	public String getInit() {
		return init;
	}

	public void setInit(String init) {
		this.init = init;
	}
	//	private TestE testE;
//
//	public TestG(TestE testE) {
//		this.testE = testE;
//	}
//
//	public TestE getTestE() {
//		return testE;
//	}
//
//	public void setTestE(TestE testE) {
//		this.testE = testE;
//	}
}
