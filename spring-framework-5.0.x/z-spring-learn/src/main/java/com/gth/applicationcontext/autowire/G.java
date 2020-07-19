package com.gth.applicationcontext.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Hugt
 * @Date: 2020/7/19 9:26
 * @Description:
 */

@Component("g")
public class G {

	@Autowired
	private F f;

}
