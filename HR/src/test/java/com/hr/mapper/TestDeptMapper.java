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
public class TestDeptMapper {
	private SqlSession sqlSession;

	@Before
	public void setUp() throws Exception {
		sqlSession = MyBatiesUtil.sqlSession();
	}
	
	@Test
	public void testalldept(){
		DeptMapper mapper=sqlSession.getMapper(DeptMapper.class);
		mapper.alldept().forEach(System.out::println);
	}
	
	@After
	public void tearDown() throws Exception {
		if (sqlSession != null) {
			sqlSession.close();
		}
	}


}
