/**
 * 归  于  X 专 属，Studying......
 */
package com.hr.mapper;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hr.entity.Dept;
import com.hr.entity.Emp;
import com.hr.util.MyBatiesUtil;

/**
 * @author 徐强    
 * @create 2018年2月6日下午1:34:54
 */
public class TestEmpMapper {
	private SqlSession sqlSession;

	@Before
	public void setUp() throws Exception {
		sqlSession = MyBatiesUtil.sqlSession();
	}
	
	/*dao层插入新员工*/
	@Test
	public void testinsert(){
		EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
		Emp emp =new Emp();
		emp.setEgendar(1);
		emp.setEmpdate(new Date());
		emp.setDepid(1);
		emp.setEname("王大麻子");
		
		Emp emp1 =new Emp();
		emp1.setEgendar(1);
		emp1.setEmpdate(new Date());
		emp1.setDepid(1);
		emp1.setEname("王小麻子");
		mapper.insert(emp);
		mapper.insert(emp1);
		sqlSession.commit();
	}
	
	/*dao层删除员工*/
	@Test
	public void testdelete(){
		EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
		int empid=2;
		mapper.delete(empid);
		sqlSession.commit();
	}
	
	/*dao层修改员工*/
	@Test
	public void testupdate(){
		EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
		Emp emp =new Emp();
		emp.setEmpid(1);
		emp.setEgendar(1);
		emp.setEmpdate(new Date());
		emp.setDepid(2);
		emp.setEname("李四");
		mapper.update(emp);
		sqlSession.commit();
	}
	
	/*dao层通过id查询员工*/
	@Test
	public void testselect(){
		EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
		int id=2;
		System.out.println(mapper.select(id));
	}
	
	/*dao层查询所有员工*/
	@Test
	public void testselectall(){
		EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
		mapper.selectall().forEach(System.out::println);
	}
	
	@After
	public void tearDown() throws Exception {
		if (sqlSession != null) {
			sqlSession.close();
		}
	}


}
