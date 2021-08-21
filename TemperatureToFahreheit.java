import java.io.*;
import java.util.*;
class TemperatureToFahreheit
{
  public static void main(String[]args)

  {
   Scanner x = new Scanner(System.in);
    double temp;
    temp=x.nextDouble();
    double c;
    c=x.nextDouble();

    System.out.println("Enter temperture in fahreheit");
    temp=(c*9/5)+32;

    System.out.println("Faherheit is" +temp);
    



    } 




 }