import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techm.service.CustomerService;
import com.techm.service.CustomerServiceInterface;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerServiceInterface service=appContext.getBean("customerService",CustomerService.class);
		
		System.out.println(service.finadAll().get(0).getFirstName());

	}

}
