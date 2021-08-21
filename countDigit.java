import java.util.*;
class countDigit{
	public static void main(String args[]){
	
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	
	int count=0;
	while(n>0){
		n=n/10;
		count++;
		}
		System.out.println(count);
	}
	}