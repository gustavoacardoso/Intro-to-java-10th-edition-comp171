import java.util.GregorianCalendar;
public class Gregorian 
{
	public static void main(String[] args) 
	{
		String[] myDays= {"Sunday", "Monday","Tuesday", "Wednesday","Thursday","Friday","Saturday"};
		String[] myMonths ={"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		GregorianCalendar myCal= new GregorianCalendar();
		System.out.println("Current year: "+myCal.get(myCal.YEAR));
		System.out.println("Month:        "+myMonths[myCal.get(myCal.MONTH)]);
		System.out.print("Weekday:      "+myDays[myCal.get(myCal.DAY_OF_WEEK)]+"\n");
		System.out.println("----------------------");
		
		long date2=1234567898765L;
		GregorianCalendar myCal2= new GregorianCalendar();
		myCal2.setTimeInMillis(date2);
		System.out.println("The value 1234567898765L means: ");
		System.out.println("Year:    "+myCal2.get(myCal2.YEAR));
		System.out.println("Month:   "+myMonths[myCal2.get(myCal2.MONTH)]);
		System.out.println("Weekday: "+myDays[myCal2.get(myCal2.DAY_OF_WEEK)]);
	}

}

/*
Current year: 2016
Month:        April
Weekday:      Thursday
----------------------
The value 1234567898765L means: 
Year:    2009
Month:   February
Weekday: Saturday
*/