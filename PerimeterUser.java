import java.io.*;
import java.util.*;
class PerimeterUser
{
  public static void main(String[]args)
  {
   Scanner x = new Scanner(System.in);
   int length;
   int width;
   int perimeter;
   
   perimeter=2*(length+width);

   System.out.println("Enter the value of length");
   System.out.println("Enetr the value of width ");
   length=x.nextInt();
   width=x.nextInt();
   
   System.out.println("Total perimeter is" + perimeter);

   }


 }