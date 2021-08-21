import java.util.Scanner;
import java.util.*;
class StudentId{
	public static void main(String args[]){

	String stName;
	String bg;
	int age;


	Scanner x= new Scanner(System.in);

	//System.out.println("______________________________");

	System.out.println("Enter Student name:");
	stName=x.nextLine();
	

	
	System.out.println("Enter Student age:");
	age=x.nextInt();
	

	System.out.println("Enter Student Blood group:");
	bg = x.next();

	System.out.println("______________________________");
	System.out.println("Name=" +stName);
	System.out.println("Age=" +age);
	System.out.println("Bloodgroup=" +bg);

	System.out.println("______________________________");

	if(age>=20){
		System.out.println("Your group is Red ");
		}
	else if(age>=15 ){
		System.out.println("Your group is Blue");
		}	
	else if(age<=10 == age<=15){
		System.out.println("Your group is yellow");
		}

	else{
		System.out.println("out of if else if:");
		}	

	System.out.println("______________________________");	}
}