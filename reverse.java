import java.util.Scanner;
class reverse{
	public static void main(String[] args){
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the number of elements:");
	int num=x.nextInt();

	int[] a=new int[num];

	System.out.println("Enter the element in the array:");
	for(int i=0; i<num; i++){
		a[i]=x.nextInt();
		}
		
	System.out.println("Reverse of array:");
	for(int i=a.length-1; i>=0; i--){
		System.out.println(a[i]+" ");
		}}}