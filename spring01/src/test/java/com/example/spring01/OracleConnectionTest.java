package com.example.spring01;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OracleConnectionTest {
	//로깅을 위한 변수 선언
	private static final Logger logger=
			LoggerFactory.getLogger(OracleConnectionTest.class);
	private static final String DRIVER=
			"oracle.jdbc.driver.OracleDriver";
	private static final String URL=
			"jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER="spring";//DB접속 id
	private static final String PW="1234";//DB접속 비번

	@Test //JUnit이 테스트하는 method
	public void test() throws Exception{
		Class.forName(DRIVER);//드라이버 로딩
		
		//try ~ with문
		try(Connection conn=
					DriverManager.getConnection(URL,USER,PW)){
				logger.info("오라클에 연결되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
