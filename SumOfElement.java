import java.util.Scanner;
class SumOfElement{
	public static void main(String args[]){
	Scanner x=new Scanner(System.in);
	int[] array=new int[10];
	int sum=0;
	System.out.println("Enter the element:");
	for(int i=0; i<array.length; i++){
		array[i]=x.nextInt();
		}

	for(int i=0; i<array.length; i++){
		sum+=array[i];
				
		}
		System.out.println("Sum of element = "+sum);
	}
}