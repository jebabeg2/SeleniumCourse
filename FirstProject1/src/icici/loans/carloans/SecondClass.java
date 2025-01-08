package icici.loans.carloans;

public class SecondClass {
	
	int a=10,b=20,c;
	
	public void add() {
		
		c=a+b;
		System.out.println("addition of a and b:  "+c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("subs of a and b: "+c);
		
	}
	

	public static void main(String[] args)
	{
		
		System.out.println("Hello...");
		
	    
	   SecondClass obj=new SecondClass();
	   obj.add();
	   obj.sub();
		
		

	}

}






























