import java.io.*;
import java.util.*;
class MarksConvert
{
  public static void main(String[]args)
 {
  Scanner x = new Scanner(System.in);
  int phy,maths,chem,eng,hin;
  double total,average,percentage;

  System.out.println("plz enter the 5 subjects marsks");

  phy=x.nextInt();
  maths=x.nextInt();
  chem=x.nextInt();
  eng=x.nextInt();
  hin=x.nextInt();

  total=phy+maths+chem+eng+hin;
  average=total/5;
  percentage=(total/500) *100;

  System.out.println("Total marks is"+total);
  System.out.println("average is"+average);
  System.out.println("percentage is"+percentage);
  



 
    }




   }