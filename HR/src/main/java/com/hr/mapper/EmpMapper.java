/**
 * 归  于  X 专 属，Studying......
 */
package com.hr.mapper;

import java.util.List;

import com.hr.entity.Emp;

/**
 * @author 徐强    
 * @create 2018年2月6日下午1:16:49
 */
public interface EmpMapper {
	
	public void insert(Emp emp);
	
	public void delete(int empid);
	
	public void update(Emp emp);
	
	public Emp select(int id);
	
	public List<Emp> selectall();
}
