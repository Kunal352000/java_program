import java.util.*;
class InverseNumber{
	public static void main(String args[]){
	
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	
	int inv=0;
	int count=1;
	
	while(n != 0){
		int rem=n%10;
		int newdigit=count;
		int newposition=rem;
		
		inv=inv + newdigit*(int)Math.pow(10,newposition-1);
		
		n=n/10;
		count++;
		System.out.println(inv);
		}
	}
}