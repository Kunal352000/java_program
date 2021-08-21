import java.util.Scanner;
class solution{
	public static void main(String args[]){
	
	Scanner x=new Scanner(System.in);
	
	
	System.out.println("TAX CALCULATOR APP");
	System.out.println("------WELCOME------");
	
	System.out.println("Enter total person count");
	int count=x.nextInt();
	
	String[] name=new String[count];
	//System.out.println("Enter the name"+name[count]);
	for(int i=0; i<count; i++){
		 name[i]=x.next();
		}
		
	System.out.println("Enter the income:");
	long[] income=new long[count];
	for(int i=0; i<count; i++){
		income[i]=x.nextLong();
	}
	} }