package andrew;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/*
 *
 *
 * @author andrew
 * @since 2022/9/18
 * */
public class SimpleBeanTest {

	@Test
	public void test1() {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("andrew/SimpleBeanTest.xml"));

		SimpleBean bean = beanFactory.getBean(SimpleBean.class);
//		bean.setTestStr("hello spring !");
		System.out.println(bean.getTestStr());

		System.out.println(beanFactory.getBean("bean1") == beanFactory.getBean("bean2"));
		System.out.println( beanFactory.getBean("bean2") == beanFactory.getBean("bean3"));
	}

	@Test
	public void test2() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("andrew/SimpleBeanTest.xml");

		SimpleBean bean = context.getBean(SimpleBean.class);
//		bean.setTestStr("hello spring !");
		System.out.println(bean.getTestStr());

		System.out.println(context.getBean("bean1") == context.getBean("bean2"));
		System.out.println( context.getBean("bean2") == context.getBean("bean3"));
	}
}
