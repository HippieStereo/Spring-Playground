package eu.jlpc.dev;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eu.jlpc.bean.MySpringBeanWithDependency;
import eu.jlpc.bean.config.Config;

@SpringBootApplication
public class SpringDependencyInjection01Application {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		MySpringBeanWithDependency springBean = context.getBean(MySpringBeanWithDependency.class);
		
		springBean.run();
		
		context.close();
		
	}

}
