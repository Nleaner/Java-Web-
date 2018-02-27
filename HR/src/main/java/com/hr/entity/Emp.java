/**
 * 归  于  X 专 属，Studying......
 */
package com.hr.entity;

import java.util.Date;

import lombok.Data;

/**
 * @author 徐强    
 * @create 2018年2月6日上午11:46:02
 */
@Data
public class Emp {

		private int empid;
		
		private String ename;
		
		private int egendar;
		
		private int depid;
		
		private Date empdate;
}
