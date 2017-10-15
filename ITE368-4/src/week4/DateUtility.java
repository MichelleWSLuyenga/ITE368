package week4;

public class DateUtility {
	//Returns whether year is a leap year?
		public static boolean isLeapYear (int year)
		{return (year%4 == 0 && year%100 != 0) || year%400 == 0;}


	  //Returns the number of days in month (in year)
		public static int daysIn (int month, int year) throws IllegalArgumentException
		{
		  if (year < 1)
		    throw new IllegalArgumentException("daysIn: year ("+year+") not positive");
		  if (month < JANUARY || month > DECEMBER)
		    throw new IllegalArgumentException("daysIn: month ("+month+") not in range [1,12]");
		  
		  //Thirty days hath September, April, June and November...
		  if (month == APRIL     ||
		      month == JUNE      ||
		      month == SEPTEMBER ||
		      month == NOVEMBER)
		    return 30;
		    
		  //...all the rest have thirty one...
		  else if (month == JANUARY || 
					     month == MARCH   ||
					     month == MAY     ||
					     month == JULY    ||
					     month == AUGUST  ||
					     month == OCTOBER ||
					     month == DECEMBER)
		    return 31;

		//...except February (must be FEBRUARY in else: see possible exception)
		  else 
		    return 28 + (isLeapYear(year) ? 1 : 0);
		}
		

	  //Returns the ordinal (1st, 2nd, 3rd, etc) representing month, day, year
		public static int ordinalDate (int month, int day, int year)
		{
		  int ordinal = 0;
		  
		  //Scan every earlier month, summing the # of days in that month...
		  for (int m=JANUARY;  m < month;  m++)
		    ordinal += daysIn(m, year);
		  
		  //...and add day in the current month
		  return ordinal + day;
		}



	  //Returns a date as an American or European String

	  public static String americanFormat (int month, int day, int year)
	  {return month + "/" + day + "/" + year;}
	  
	  
	  public static String europeanFormat (int month, int day, int year)
	  {return day + "/" + month + "/" + year;}
	  
	  
	   

	  //Fields: all public static final (constants supplied by class)
	  //These could be private, for use only in this class,
	  //  but what the heck, let programmers use them from this class
	  //  (as constants, there is nothing a programmer can do to mess things up)
	  
	  public static final int JANUARY   =  1;  
	  public static final int FEBRUARY  =  2;  
	  public static final int MARCH     =  3;  
	  public static final int APRIL     =  4;  
	  public static final int MAY       =  5;  
	  public static final int JUNE      =  6;  
	  public static final int JULY      =  7;  
	  public static final int AUGUST    =  8;  
	  public static final int SEPTEMBER =  9;  
	  public static final int OCTOBER   = 10;  
	  public static final int NOVEMBER  = 11;  
	  public static final int DECEMBER  = 12;  
	  
	  
}
