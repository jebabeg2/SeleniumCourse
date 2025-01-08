package icici.loans.carloans;

public class Hdfc implements Rbi {

	@Override
	public void deposit() {
		System.out.println("i am overriden deposit in Hdfc");
		
	}

	@Override
	public void withdrawl() {
		System.out.println("i am overriden withdrwal in Hdfc");
		
	}
	
	
		public static void main(String[] args) {
			
			Hdfc h=new Hdfc();
			h.deposit();
			h.withdrawl();

		}


}
