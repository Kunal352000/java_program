import java.util.Scanner;
class selectionSorting{
	public static void main(String args[]){
	
	Scanner x=new Scanner(System.in);
	int[] a=new int[5];
	int min;
	int temp=0;
	System.out.println("Enter the element in the array");{
	for(int i=0; i<5; i++){
		a[i]=x.nextInt();
		}
		
	for(int i=0; i<5; i++){
		min=i;
		for(int j=i+1; j<5; j++){
			if(a[j]<a[min]){
				min=j;
			}
		}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
	
	System.out.println("Sorted array:");
	for(int i=0; i<5; i++){
		System.out.println(a[i]+ " ");
		
	}
	}
	}
	}