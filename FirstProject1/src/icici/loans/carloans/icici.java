package icici.loans.carloans;

public class icici implements Rbi 
{
	
	public static void main(String[] args)
	{
		icici i=new icici();
		i.deposit();
		i.withdrawl();
		
	}

	@Override
	public void deposit() {
		
		System.out.println("i am overriden deposit in icici");
		
	}	
		
	@Override
	public void withdrawl() {
		
		System.out.println("i am overriden withdrawl in icici");


	}

}
