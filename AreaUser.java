import java.io.*;
import java.util.*;
class AreaUser
{
  public static void main(String[]args)
  {
   Scanner x = new Scanner(System.in);
    int length;
    int width;
    int area;
    area=(length*width);
     
    System.out.println("Enter the length");
    System.out.println("Enter the width");

    length=x.nextInt();
    width=x.nextInt();

    System.out.println("total area is" +area);
    }



 }