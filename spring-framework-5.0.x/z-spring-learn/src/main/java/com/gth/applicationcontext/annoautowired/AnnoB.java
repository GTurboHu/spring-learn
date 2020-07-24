package com.gth.applicationcontext.annoautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Hugt
 * @Date: 2020/7/24 23:03
 * @Description:
 */

@Component("annoB")
public class AnnoB {

	@Autowired
	private AnnoC annoC;


}
