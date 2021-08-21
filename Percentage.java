class Percentage
{
 public static void main(String args[])
{
 int physics=70;
 int chemistry=76;
 int maths=89;
 int english=66;
 int hindi=71;

 int total,average,per;

   total = physics+chemistry+maths+english+hindi;
  average = total/5;
   per = (total/500)*100;

  System.out.println("Total marks is"+total);
  System.out.println("average is"+average);
  System.out.println("percentage"+per);


}


}