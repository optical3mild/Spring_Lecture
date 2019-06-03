package com.example.spring02;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// JUnit 4.0으로 현재 클래스를 실행시키기 위해 아래의 어노테이션 사용
@RunWith(SpringJUnit4ClassRunner.class)

// mybatis에서 참조하는 설정 파일의 위치를 알려주기 위해
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})


public class MybatisTest {
	//로깅처리를 위한 코드
	private static final Logger Logger = LoggerFactory.getLogger(MybatisTest.class);
	
	//**의존관계 주입(스프링에서 객체를 생성, 전달해주는 역할)
	//즉, root-context.xml 파일안에 sqlSessionFactory객체를 생성해 놓았음.
	//그러므로 @Inject란 개념은 스프링에서 이미 만들어 놓은 객체를 가져다 쓴다는 뜻.
	//@AutoWired이 같은 기능을 함.
	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() {
		Logger.info("sqlFactory : " +sqlFactory);
	}
	
	@Test
	public void testSession() {
		//mybatis 실행을 위한 SqlSession 객체 생성
		try(SqlSession sqlSession = sqlFactory.openSession()){
			Logger.info("sqlSession : " + sqlSession);
			Logger.info("mybatis 연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
