import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.techm.service.CustomerService;

@Configuration
@ComponentScan({"com.techm"})
@PropertySource("app.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer gPropertySourcesPlaceholderConfigurer()
	{
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
	//@Bean(name="customerService")
	//public CustomerServiceInterface getCustomerServiceInterface()
	//{
		//CustomerService service=new CustomerService(getCustomerRepository());
		CustomerService service= new CustomerService();
	//	service.setCustomerRepository(getCustomerRepository());
		//return service;
	//}
	
	//@Bean(name="customerRepository")
	//public CustomerRepository getCustomerRepository()
	//{
		//return new HibernateCustomerRepository();
	//}
}
