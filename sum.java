import java.util.Scanner;
class sum{
	public static void main(String args[]){
	
	int n,sumEven=0,sumOdd=0;
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the numbers of elements in array:");
	n=x.nextInt();

	int[] a=new int[n];
	System.out.println("Enter the elements in the array:");
	for(int i=0; i<n; i++){
		a[i]=x.nextInt();
		}

	for(int i=0; i<n; i++){
		if(a[i]%2==0){
			sumEven+=a[i];
			}
		else{
			sumOdd+=a[i];
			}
		}
		System.out.println("Sum of even number ="+sumEven);
		System.out.println("Sum of odd number ="+sumOdd);
		}
}