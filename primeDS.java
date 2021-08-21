import java.util.*;
class primeDs{
	public static void main(String args[]){
	
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the limit:");
	int t=x.nextInt();
	
	for(int i=0; i<t; i++){
		
		int n=x.nextInt();
		
	int count=0;
	for(int div=1; div<=n; div++){
		if(n%div == 0)
		count++;
		}
		
		if(count==2){
			System.out.println("prime");
			}
		else{
			System.out.println("not prime");
			}
	
	
	}

 }
}