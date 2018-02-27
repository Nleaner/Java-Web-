package com.hr.service;

import java.util.Date;

import org.junit.Test;

import com.hr.entity.Dept;
import com.hr.entity.Emp;

public class TestEmpService {
	
	EmpService empService = new EmpServiceImpl();
	
@Test
public void testfindall(){
	empService.findall().forEach(System.out::println);
}


@Test
public void testfind(){
	int id=1;	
	System.out.println(empService.find(id));
}

@Test
public void testinsert(){
	Emp emp =new Emp();
	emp.setEmpid(3);
	emp.setEgendar(1);
	emp.setEmpdate(new Date());
	emp.setDepid(2);
	emp.setEname("xx");
	empService.insert(emp);
}

@Test
public void testdelete(){
	int id=3;
	empService.delete(id);
}

@Test
public void testupdate(){
	Emp emp =new Emp();
	emp.setEmpid(3);
	emp.setEgendar(1);
	emp.setEmpdate(new Date());
	emp.setDepid(2);
	emp.setEname("cc");
	empService.update(emp);
}

}
