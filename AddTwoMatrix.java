//import java.util.Scanner;
class AddTwoMatrix{
	public static void main(String args[]){
		
	int[][] arr1={
		      {10,15,20},
		      {10,15,20},
		      {10,15,20},
			};
	int[][] arr2={
			{10,20,30},
			{10,20,30},
			{10,20,30},
			};

	int[][] arr3=new int[3][3];

	for(int row=0; row<arr1.length; row++){
		for(int column=0; column<arr2[row].length; column++){
		arr3[row][column]=arr1[row][column]+arr2[row][column];
		System.out.print(arr3[row][column] + " ");
		}
			System.out.println();		
	}

}
}
	