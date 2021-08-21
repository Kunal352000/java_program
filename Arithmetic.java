import java.io.*;
import java.util.*;
class Arithmetic
{
 public static void main(String[]args)
  {
    Scanner x = new Scanner(System.in);
    int a;
    int b;
    System.out.println("Enter two integer numbers");
    a=x.nextInt();
    b=x.nextInt();
    
    System.out.println("Add is" + (a+b));

    System.out.println("Sub is" + (a-b));

    System.out.println("mul is" + (a*b));

    System.out.println("div is" + (a/b));

   }


  }