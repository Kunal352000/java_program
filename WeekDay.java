import java.util.Scanner;
class WeekDay{
	public static void main(String args[]){
	
	Scanner x=new Scanner(System.in);
	int day;
	
	System.out.println("Enter the weekday number 1-7");
	day=x.nextInt();
	
	if(day<1 || day>7){
			System.out.println("Enter the valid number:");
			}
		
	switch(day){
		case 1:
		System.out.println("monday");
		break;
	
		
		case 2:
		System.out.println("tuesday");
		break;
		
		
		case 3:
		System.out.println("wednesday");
		break;
		
		case 4:
		System.out.println("thrusday");
		break;
		
		case 5:
		System.out.println("Friday");
		break;
		
		case 6:
		System.out.println("satarday");
		break;
		
		
		case 7:
		System.out.println("sunday");
		break;
		
		default:
		System.out.println("invalid");
		
		}
		}
	}