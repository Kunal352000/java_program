import java.util.Scanner;
class IsPrime{
	public static void main(String args[]){

	int num,i,temp=0;
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the number");
	num=x.nextInt();
	i=2;
	while(i<(num-1)){
		i++;
		if(num%i==0){
		temp=temp+1;
		}
	}
		if(temp==0){
			System.out.println(" prime number:"+num);
			}
		else{
			System.out.println("not Prime number:"+num);
			}
	}
}