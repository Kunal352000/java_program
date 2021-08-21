class multiOfMatrix{
	public static void main(String args[]){

	int[][] a={
		{1,2,3},
		{1,2,3},
		{1,2,3}
		};

	int[][] b={
		{1,2,3},
		{2,3,4},
		{3,4,5}
		};

	int[][] c=new int[3][3];

	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			for(int k=0; k<3; k++){
			c[i][j]=c[i][j] + a[i][k] * b[k][j];
				}
			}
		}

	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			System.out.print(c[i][j] + " ");
			}
		System.out.println();	
		}

	}
}