class lab12Driver 
{
	public static void main(String[] args) 
	{
		lab12 me = new lab12();
		lab12 you = new lab12(123,999999.99);
		double bal;
		System.out.println("Hello   " + me.getID());
		System.out.println("my balance is: " + me.getBalance());
		System.out.println("Your balance is: " + you.getBalance());
		if (me.withdraw(500)<0)
			System.out.println("Negative balance");
		else
			System.out.println("new balance is : " + me.getBalance());
		
		me.Deposit(-500);


	}
}
