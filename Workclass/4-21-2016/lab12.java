import java.util.Date;
class lab12 
{
	//define the class variables...attributes
	private int id;
	private double balance;
	private static double annualIntRate=.0525;
	private Date dateCreated;
	//end of class variables definition
	
	//constructors
	//default constructor
	public lab12()
	{
		id=0;
		balance=0;
		//annualIntRate=0;
		Date dateCreated= new Date();
	}
	//constructor with id and openning balance
	public lab12(int i, double b)
	{
		id=i;
		balance=b;
		Date dateCreated = new Date();
	}
	//selectors methods .... gets first
	public int getID()
	{
		return id;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getMonthlyInterest()
	{
		double interest = (balance*(annualIntRate/12));
		balance = balance+interest;
		return interest;
	}
	public double getInterestRate()
	{
		return annualIntRate;
	}
	public Date getDate()
	{
		return dateCreated;
	}
	//now the sets 
	public void setID(int i)
	{
		id=i;
	}
	public void setBalance (double b)
	{
		balance=b;
	}
	public void setIntRate(double r)
	{
		annualIntRate=r;
	}
	//mutators deposit and withdraw methods
	public double Deposit( double a)
	{
		if(a<0)
			System.out.println("This is a withdraw..");
		else
		balance=balance+a;
		return balance;
	}
	public double withdraw ( double a)
	{
		double bal=balance;
		bal=bal-a;
		if(bal<0)
			return bal;
		else 
		{
			balance=bal;
			return balance;

		}
			
	}




}
