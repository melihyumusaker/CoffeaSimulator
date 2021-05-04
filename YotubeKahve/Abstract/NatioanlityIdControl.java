
public class NatioanlityIdControl implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		int total=0;
		int singleDigit = 0; 
		int doubleDigit = 0;
		int rule;
		
		if(customer.getNationalityId().length()<11) {
			return false;
		}
		else if(customer.getNationalityId().startsWith("0")) {
			return false;
		}
		
		char arrChar[] =customer.getNationalityId().toCharArray();
		int[] arr = new int[arrChar.length];
		for(int i = 0 ; i < arrChar.length ; i++) {
			arr[i] = Integer.parseInt(arrChar[i] + "");
		}
		
		if (arr[10] % 2 != 0) {
            return false;
        }
		
		for (int i = 0; i < 9; i++) {
        	total += arr[i];
            if ((i % 2) == 0) {
            	singleDigit += arr[i];
            } else {
            	doubleDigit += arr[i];
            }
        }
		
		 total += arr[9];
	        rule = ((singleDigit * 7) - doubleDigit);
	        if (rule % 10 != arr[9]) {
	            return false;
	        }
	        else if ((total % 10) != arr[10]) {
	            return false;
	        }
	        
	        return true;
	      }
		
	}

}
