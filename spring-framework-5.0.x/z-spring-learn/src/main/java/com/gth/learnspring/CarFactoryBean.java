package com.gth.learnspring;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: Hugt
 * @Date: 2020/5/31 9:35
 * @Description:
 */

public class CarFactoryBean implements FactoryBean<Car> {

	private  String carInfo;

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		String[] infos = carInfo.split(",");
		car.setBrand(infos[0]);
		car.setMaxSpeed(Integer.valueOf(infos[1]));
		car.setPrice(Double.valueOf(infos[2]));
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	//该工厂所管理的对象是单例吗？
	@Override
	public boolean isSingleton(){
		return false;
	}

	public String getCarInfo() {
		return carInfo;
	}
	//接受逗号分隔符设置属性信息
	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
}
