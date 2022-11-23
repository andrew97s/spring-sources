package andrew;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *
 *
 * @author andrew
 * @since 2022/10/24
 * */
public class ApplicationContextTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("andrew/SimpleBeanTest.xml");
		SimpleBean bean = context.getBean(SimpleBean.class);
		bean.setTestStr("Hello there !");
		System.out.println(bean.getTestStr());
	}
}
