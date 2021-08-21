import java.util.Scanner;
class CheckElement{
	public static void main(String args[]){

	Scanner x=new Scanner(System.in);
	int[] arr=new int[20];
	int pos=0;
	int neg=0;
	int zero=0;
	int even=0;
	int odd=0;
	System.out.println("Enter the element in the array:");
	for(int i=0; i<arr.length; i++){
		
		arr[i]=x.nextInt();

	if(arr[i]>0){
		pos++;
		}
		
	else if(arr[i]<0){
		neg++;
		}
	else{
		zero++;
		}

	if(arr[i]%2==0){
		even++;
		}
	else{
		odd++;
		}

		}
	System.out.println("positive number ="+pos);
	System.out.println("Negitive number ="+neg);
	System.out.println("zero number ="+zero);
	System.out.println("Even number ="+even);
	System.out.println("Odd number ="+odd);

	}
}