package d421;
import java.util.GregorianCalendar;
public class calendar {

	public static void main(String[] args) 
	{
		String[] myDays= {"","SUNDAY", "MONDAY","TUESDAY", "WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		String[] months ={"JAN","FEB","MAR","APR","MAY","JUN","JULY","AUG","SEP","OCT","NOV","DEC"};
		GregorianCalendar myCal= new GregorianCalendar();
		long date2=999999999l;
		GregorianCalendar myCal2= new GregorianCalendar();
		myCal2.setTimeInMillis(date2);
		System.out.print("Year= "+myCal.get(myCal.YEAR));
		int Month= myCal.get(myCal.MONTH);
		int day = myCal.get(myCal.DAY_OF_WEEK);
		System.out.print( " Month is= "+months[myCal.get(myCal.MONTH)]);
		System.out.print( " Weekday is= "+myDays[myCal.get(myCal.DAY_OF_WEEK)]+"\n");
		System.out.println("***************************************************");
		System.out.print("Year= "+myCal2.get(myCal2.YEAR));
		Month= myCal2.get(myCal2.MONTH);
		day = myCal2.get(myCal2.DAY_OF_WEEK);
		System.out.print( " Month is= "+months[myCal2.get(myCal2.MONTH)]);
		System.out.print( " Weekday is= "+myDays[myCal2.get(myCal2.DAY_OF_WEEK)]);
		
		
	}

}
