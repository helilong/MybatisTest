package com.xiaohe.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xiaohe.pojo.Student;

public class Test1 {
	public static void main(String[] args) throws IOException {
		//得到配置文件
		String resource = "mybatis-config.xml";
		
		InputStream inputstream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputstream);
		
		SqlSession session = sqlSessionFactory.openSession();
		
		List<Student> stu = session.selectList("listStudent");
		
		for (Student student : stu) {
			System.out.println(student.getName());
		}
	}
}
