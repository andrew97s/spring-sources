package andrew;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/*
 *
 *
 * @author andrew
 * @since 2022/9/22
 * */
public class BeforeInstantiationPostProcessorsTest implements InstantiationAwareBeanPostProcessor {

	private String name ;

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanClass.isAssignableFrom(SimpleBean.class)) {
			try {
				SimpleBean simpleBean = SimpleBean.class.newInstance();

				simpleBean.setTestStr("this is BeforeInstantiationPostProcessorsTest generated bean");

				return simpleBean;
			} catch (InstantiationException e) {
				throw new RuntimeException(e);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}
		return null;
	}

}
