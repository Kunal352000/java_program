class Main6{
	public static void main(String args[]){
	int[][] array2d={
			{10,20,30,40},
			{20,30,40,50},
			{30,40,50,60},
			{40,50,60,70}};

	for(int row=0; row<array2d.length; row++){
		for(int column=0; column<array2d[row].length; column++){
			System.out.print(array2d[row][column] +" ");
		}
			System.out.println();
	}
	}}