package yong.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		
		String[] configNames={"applicationContext.xml"};
		ApplicationContext context= new ClassPathXmlApplicationContext(configNames);
		MessageBean bean=(MessageBean)context.getBean("messageBean");
		bean.sayHello();
	}

}
