import java.util.Scanner;
class NestedIfElse{
	public static void main(String args[]){
	
	Scanner x=new Scanner(System.in);
	
	System.out.println("Enter the age:");
	int age=x.nextInt();
	
	System.out.println("Enter the weigth:");
	int weigth=x.nextInt();
	
	if(age >= 18){
		if(weigth >= 50){
		System.out.println("U are elgible");
		}
		else{
		System.out.println("U are not elgible");
		}
	}
		
	else{
		System.out.println("U are not elgible:");
		}
				
	}
}