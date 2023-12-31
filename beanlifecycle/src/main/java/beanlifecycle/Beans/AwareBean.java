package beanlifecycle.Beans;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext method of AwareBeanImpl is called");
		System.out.println("setApplicationContext:: Bean Definition Names= "
		+ Arrays.toString(applicationContext.getBeanDefinitionNames()));
		}
	

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setBeanFactory method of AwareBeanImpl is called");
		System.out.println("setBeanFactory:: AwareBeanImpl singleton= "
		+ beanFactory.isSingleton("awareBean"));
		}

	

	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		System.out.println("setBeanName method of AwareBeanImpl is called");
		System.out.println("setBeanName:: Bean Name defined in context= "
		+ beanName);

	}

}
