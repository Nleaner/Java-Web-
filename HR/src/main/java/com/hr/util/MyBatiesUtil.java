package com.hr.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatiesUtil {

	private static SqlSessionFactory sqlSessionFactory = null;

	static {
		try (InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml")) {
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static SqlSession sqlSession() {
		return sqlSessionFactory == null ? null : sqlSessionFactory.openSession();
	}

	public static void close(SqlSession sqlSession) {
		if (sqlSession != null) {
			sqlSession.commit();
			sqlSession.close();
		}
	}
}
