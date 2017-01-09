import java.util.Date;
class Lab12 
{
	//DEFINE THE CLASS VARIABLES...ATTRIBUTES
	  private int id;
	  private double balance;
	  private static double annualIntRate=.0525;
	  private Date dateCreated;
   //END OF CLASS VARIABLE DEFINITION
   //CONSTRUCTORS
   //DEFAULT CONSTRUCTOR
   public Lab12()
	{
	   id=0;
	   balance=0;
	   //annualIntRate=0;
	   Date dateCreated = new Date();
	}
   //CONSTRUCTOR WITH ID AND OPENING BALANCE
   public Lab12(int I,double B)
	{
	   id=I;
	   balance=B;
	   Date dateCreated = new Date();
	}
 //SELECTOR METHODS...GETS FIRST
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
	   balance=balance+interest;
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
//NOW THE SETS
  public void setID(int I)
	{
	  id=I;
	}
  public void setBalance(double B)
	{
	  balance=B;
	}
  public void setIntRate(double R)
	{
	  annualIntRate=R;
	}
//MUTATORS DEPOSIT AND WITHDRAWAL METHODS
  public double Deposit(double a)
	{ 
	  if(a<0)
		  System.out.println("THIS IS A WITHDRAWAL IDIOT...NO CHANGE TO BALANCE");
	  else
		balance=balance+a;
	  return balance;
	}
  public double Withdrawal (double a)
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
