package cn.tx.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tx.service.UserService;

public class TestTx {
	
	@Test
	public void testUserService() {
		ApplicationContext context = new ClassPathXmlApplicationContext("all_schema_application.xml");
	 	UserService useService =  (UserService) context.getBean("useService");
	 	useService.tranferAccount();
	}
}
