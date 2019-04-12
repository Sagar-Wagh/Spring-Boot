import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techm.service.CustomerServiceInterface;

public class Application {

	public static void main(String[] args) {
		ApplicationContext  appContext=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//CustomerServiceInterface service=new CustomerService();
		CustomerServiceInterface service=
				appContext.getBean("customerService",CustomerServiceInterface.class);
		System.out.println(service);
		
		CustomerServiceInterface service2=
				appContext.getBean("customerService",CustomerServiceInterface.class);
		System.out.println(service2);
		
		System.out.println(service.finadAll().get(0).getFirstName());

	}

}
