import java.util.Scanner;
class CopyArray{
	public static void main(String args[]){

	Scanner x=new Scanner(System.in);
	int[] a=new int[10];
	int[] b=new int[10];
	
	System.out.println("Enter the element:");
	for(int i=0; i<a.length; i++){
		a[i]=x.nextInt();
		}
	int j=0;
	for(int i=b.length-1; i>=0; i--)//9;0;8
		{
		b[i]=a[i];
		j++;
		}
	
	for(int i=0; i<a.length; i++){
		System.out.println("Copy of a[i] = "+b[i]);
			}
		}
	}