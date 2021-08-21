import java.util.Scanner;
class evenNumber{
	public static void main(String args[]){

	int n;
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the number of element: ");
	n=x.nextInt();
	int[] a=new int[n];
	System.out.println("Enter the element in the array:");
	for(int i=0; i<n; i++){
		a[i]=x.nextInt();
		}

	System.out.println("Even number in the array are:");
	for(int i=0; i<n; i++){
		if(a[i]%2==0){
		System.out.print(a[i]+" ");	
			}
	System.out.println();
		}
	}
}