import java.util.Scanner;
class IfElseIf{
	public static void main(String args[]){
		
	Scanner x=new Scanner(System.in);
	
	System.out.println("Enter the marks:");
	int marks=x.nextInt();
	
	if(marks<50){
		System.out.println("Fail");
		}
		
	else if(marks>=50 && marks<60){
		System.out.println("D garde");
		}
		
	else if(marks>=60 && marks<70){
		System.out.println("C garde");
		}
		
	else if(marks>=70 && marks<80){
		System.out.println("B grade");
		}
		
	else if(marks>=80 && marks<90){
		System.out.println("A garde");
		}
		
	else if(marks>=90 && marks<=100){
		System.out.println("A+");
	}
	else{
		System.out.println("Invalid");
		}		
	}
}