package com.gth.applicationcontext.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Hugt
 * @Date: 2020/7/19 9:26
 * @Description:
 */

@Component("f")
public class F {

	@Autowired
	private G g;

}
