
public class StarbucksCustomerManager extends BaseCustomerManager  {

	private ICustomerCheckService _customerCheckService;
	

	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		
		super();
		this._customerCheckService = _customerCheckService;
	}


	@Override
	 public void Save(Customer customer) {			
		
		if(_customerCheckService.CheckIfRealPerson(customer))
			super.Save(customer);		
		else 
			System.out.println("Not a valid person");					
		}
	
	 
	
}
