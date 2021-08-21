import java.util.Scanner;
class largestEven{
	public static void main(String args[]){
		
	Scanner x=new Scanner(System.in);
	
	int[] a=new int[10];
	int largeEven=0;
	
	System.out.println("Enter the element in the array:");
	for(int i=0; i<10; i++){
		a[i]=x.nextInt();
		if(a[i]%2==0 && a[i]>largeEven){
			largeEven=a[i];
			}
			
		}
		System.out.println("Largest Even number is = "+largeEven);	
			}
		}