import java.util.Scanner;
class SubOfMatrix{
	public static void main(String[] args){

	Scanner x=new Scanner(System.in);
	int[][] a=new int[3][3];
	int[][] b=new int[3][3];
	int[][] c=new int[3][3];

	System.out.println("Enter the element in the array1:");
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
		a[i][j]=x.nextInt();
			}
		}

	System.out.println("Enter the element in the array2:");
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
		b[i][j]=x.nextInt();
			}
		}

	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
		c[i][j]=a[i][j]-b[i][j];
			}
		}
	
	System.out.println("Subtraction of two matrix is:");
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
		System.out.print(c[i][j] + " ");
			}
		System.out.println();
		}
	}
}