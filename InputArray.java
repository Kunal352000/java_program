import java.util.Scanner;
class InputArray{
	public static void main(String args[]){

	int[]a=new int[10];
	Scanner x=new Scanner(System.in);
	System.out.println("Enter the element in array");
	for(int i=0; i<a.length; i++){
	//System.out.println("Enter the element in array");
	a[i]=x.nextInt();}

	for(int i=0; i<a.length; i++){
	System.out.println("Elements are=" +a[i]);
		}
	}
}