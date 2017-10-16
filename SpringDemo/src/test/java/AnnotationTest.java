

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shixun.dao.UserDao;
import com.shixun.service.IUserService;

public class AnnotationTest {

	@Test
	public void Test() {

		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao =(UserDao) context.getBean("userDao");
		userDao.save();
	}

	@Test
	public void Test1() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService userDao =(IUserService) context.getBean("userService");
		userDao.save();
	}
}
