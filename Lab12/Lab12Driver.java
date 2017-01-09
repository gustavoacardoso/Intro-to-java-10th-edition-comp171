class Lab12Driver 
{
	public static void main(String[] args) 
	{
		Lab12 me = new Lab12();
		Lab12 you = new Lab12(123,99999.99);
		double bal;
		double intt;
		System.out.println("Hello "+me.getID());
		System.out.println("Your Balance is $"+me.getBalance());
		System.out.println("Hello "+you.getID());
		System.out.println("Your Balance is $"+you.getBalance());
		if(me.Withdrawal(500)<0)
			System.out.println("NEGATIVE BALANCE...ACCOUNT FROZEN");
		else
			System.out.println("New Balance = $"+me.getBalance());
		
		
		me.Deposit(-500);
		System.out.println("Interset Accurred This Month $"+(you.getMonthlyInterest()));
	}
}
