/**
 * 归  于  X 专 属，Studying......
 */
package com.hr.service;

import org.junit.Test;

/**
 * @author 徐强    
 * @create 2018年2月6日下午6:07:27
 */
public class TestDeptService {
	
	DeptService de=new DeptServiceImpl();
	
@Test
public void testalldept(){
	de.alldept().forEach(System.out::println);
}
}
