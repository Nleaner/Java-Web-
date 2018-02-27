package com.hr.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hr.entity.Dept;
import com.hr.mapper.DeptMapper;
import com.hr.util.MyBatiesUtil;

public class DeptServiceImpl implements DeptService {
	
	SqlSession session = MyBatiesUtil.sqlSession();
	DeptMapper mapper=session.getMapper(DeptMapper.class);
	@Override
	public List<Dept> alldept() {
		// TODO Auto-generated method stub
		return mapper.alldept();
	}

}

