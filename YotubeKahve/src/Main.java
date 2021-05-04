
import java.util.Date;
public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setDateOfBirth(new Date(2000,8,26));
		customer.setFirstName("Engin");
		customer.setLastName("Demiroð"); 
		customer.setNationalityId("28861499108");  
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(customer);

	}

}
