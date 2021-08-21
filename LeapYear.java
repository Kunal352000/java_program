import java.util.Scanner;
class LeapYear{
	public static void main(String args[]){
		
	Scanner x=new Scanner(System.in);
	
	System.out.println("Enter the year:");
	int year=x.nextInt();
	
	if((year % 4 == 0 && year % 100 != 0)|| year % 400 ==0){
		System.out.println("Year is leap "+ year);
		}
		
	else{
		System.out.println("Year is not leap "+ year);
		}
	}}