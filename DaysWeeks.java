import java.io.*;
import java.util.*;
class DaysWeeks
{
  public static void main(String[]args)	
  {
	Scanner x = new Scanner (System.in);

	int days;
	days = x.nextInt ();
        int years;
       // years =x.nextInt ();
        int weeks;
       // weeks=x.nextInt ();

        years=days/365; 
        weeks=(days%365)/7;
        days=days-((years*365)+(weeks*7));
        System.out.println("Enter the days");
        System.out.println("year is="+ years);
        System.out.println("week is="+ weeks);
        System.out.println("day is=" +  days );
        

        


  }


  }