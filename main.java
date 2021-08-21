import java.util.Scanner;
class main2{
	public static void main(String args[]){

	int num,i,count=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter any number:");
	num=scanner.nextInt();
	for(i=2; i<=num/2; i++){
		if(num%i==0){
			System.out.println("prime number");
			}
		else{
			System.out.println("not prime number");
			}
		}
	}
}