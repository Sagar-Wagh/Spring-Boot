import com.techm.service.CustomerService;
import com.techm.service.CustomerServiceInterface;

public class Application {

	public static void main(String[] args) {
		CustomerServiceInterface service=new CustomerService();
		
		System.out.println(service.finadAll().get(0).getFirstName());

	}

}
