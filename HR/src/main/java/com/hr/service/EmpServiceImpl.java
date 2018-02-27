/**
 * 归  于  X 专 属，Studying......
 */
package com.hr.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hr.entity.Emp;
import com.hr.mapper.EmpMapper;
import com.hr.util.MyBatiesUtil;

/**
 * @author 徐强    
 * @create 2018年2月6日下午2:11:14
 */
public class EmpServiceImpl implements EmpService{
	
		SqlSession session = MyBatiesUtil.sqlSession();
		EmpMapper mapper=session.getMapper(EmpMapper.class);
	@Override
	public List<Emp> findall() {
		// TODO Auto-generated method stub
		List<Emp> l=mapper.selectall();
		return l;
	}

	@Override
	public Emp find(int id) {
		// TODO Auto-generated method stub
		return mapper.select(id);
	}

	@Override
	public void insert(Emp emp) {
		// TODO Auto-generated method stub
		mapper.insert(emp);
		session.commit();
	}

	@Override
	public void delete(int empid) {
		// TODO Auto-generated method stub
		mapper.delete(empid);
		session.commit();
	}

	@Override
	public void update(Emp emp) {
		// TODO Auto-generated method stub
		mapper.update(emp);
		session.commit();
	}

}
