import java.io.*;
import java.util.*;
class Bill
{
 public static void main(String[]args)
 {
   Scanner x = new Scanner(System.in);
   int unit;
   int total;
   System.out.println("Plz enter the units");

   unit=x.nextInt();
   total=x.nextInt();
   total=unit*100;
  
   System.out.println("Your Bill is" + total);

  }


}