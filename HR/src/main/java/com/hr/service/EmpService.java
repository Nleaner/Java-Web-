/**
 * 归  于  X 专 属，Studying......
 */
package com.hr.service;

import java.util.List;

import com.hr.entity.Emp;

/**
 * @author 徐强    
 * @create 2018年2月6日下午2:07:09
 */
public interface EmpService {
	
	/*查询所有员工信息*/
	public List<Emp> findall();
	
	/*查询指定id的员工信息*/
	public Emp find(int id);
	
	/*增加新员工*/
	public void insert(Emp emp);
	
	/*删除员工信息*/
	public void delete(int empid);
	
	/*更改指定员工信息*/
	public void update(Emp emp);
}
