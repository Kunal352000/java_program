import java.io.*;
import java.util.*;
class MeasurmentConvert
{
  public static void main(String[]args)   

  {
 double cm,meter,kilometer;
 Scanner x = new Scanner(System.in);
 cm=x.nextDouble();

  System.out.println("Enter the value in cm");

  meter = cm/100.0;
  kilometer = cm/100000.0;

  System.out.println("Meter is" +meter+ "m");
  System.out.println("Kilometer is" +kilometer+ "km");

}

 }