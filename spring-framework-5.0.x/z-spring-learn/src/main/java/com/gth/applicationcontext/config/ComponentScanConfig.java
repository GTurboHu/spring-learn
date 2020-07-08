package com.gth.applicationcontext.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Hugt
 * @Date: 2020/7/8 23:31
 * @Description:
 */

//@Configuration
//@ComponentScans(@ComponentScan())
@Configuration
@ComponentScan(value = "com.gth.applicationcontext.autowire")
public class ComponentScanConfig {

}
