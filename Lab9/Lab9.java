import java.util.GregorianCalendar;
import java.util.Scanner;
public class Lab9
{

        public static void main(String[] args)
        {
                String myDays[] ={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
                String myMonth[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
                int inputm,inputd,inputy;
                long date2=3141596259874L;
                GregorianCalendar myCal = new GregorianCalendar();
                GregorianCalendar myCal2 = new GregorianCalendar();
                Scanner in = new Scanner(System.in);
                myCal2.setTimeInMillis(date2);


                System.out.println("Enter Your Birth Month: ");
                inputm = in.nextInt()-1;
                System.out.println("Enter Your Birth Day: ");
                inputd = in.nextInt();
                System.out.println("Enter Your Birth Year: ");
                inputy = in.nextInt();

                System.out.print("Todays Date:   ");
                System.out.print("Year = "+myCal.get(myCal.YEAR));
                System.out.print("  Month = "+ myMonth[myCal.get(myCal.MONTH)]);
                System.out.println("  " +myCal.get(myCal.DAY_OF_MONTH));


                inputy = myCal.get(myCal.YEAR)-inputy;
                inputm = inputm - myCal.get(myCal.MONTH);
                inputd = inputd-myCal.get(myCal.DAY_OF_MONTH);

                System.out.println("=========================================");
                System.out.print("3141596259874L:   ");
                System.out.print("Year = "+myCal2.get(myCal2.YEAR));
                System.out.print("  Month = "+myMonth[myCal2.get(myCal2.MONTH)]);
                System.out.println("  "+myCal2.get(myCal2.DAY_OF_MONTH));




                System.out.println("-------------------------------------------------");
                System.out.println("You are " + inputy + " years of age");

                if(inputm < 0)
                        System.out.println("Your Birth Month was " + Math.abs(inputm) + " months ago");
                else
                        System.out.println("Your Birth Month is " + inputm + " months from now");

                if(inputd < 0)
                        System.out.println("Your Birth Day was " + Math.abs(inputd) + " days ago");
                else
                        System.out.println("Your Birth Day is " + inputd + " days from now");
        }
}