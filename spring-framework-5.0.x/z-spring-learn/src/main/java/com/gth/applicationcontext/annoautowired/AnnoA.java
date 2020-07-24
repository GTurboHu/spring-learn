package com.gth.applicationcontext.annoautowired;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: Hugt
 * @Date: 2020/7/24 23:03
 * @Description:
 */

@Component("annoA")
public class AnnoA {

	@Resource
	private AnnoC annoC;

}
