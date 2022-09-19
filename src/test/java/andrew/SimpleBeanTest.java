package andrew;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
		bean.setTestStr("hello spring !");
		System.out.println(bean.getTestStr());
	}
}
