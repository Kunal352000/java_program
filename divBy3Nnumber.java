import java.util.Scanner;
class divBy3Number{
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

	System.out.println("Element div by 3 are:");
	for(int i=0; i<n; i++){
		if(a[i]%3==0){
		System.out.print(a[i]+" ");	
			}
	System.out.println();
		}
	}
}