import java.util.Scanner;
class NegitiveElement{
	public static void main(String args[]){
	Scanner x= new Scanner(System.in);

	int[] array=new int[10];
	System.out.println("Enter the element:");
	for(int i=0; i<array.length; i++){
		array[i]=x.nextInt();
		}
	for(int i=0; i<array.length; i++){
		if(array[i]<0){
		System.out.println("Negitive element are:"+array[i]);
			}
		}
	}
}