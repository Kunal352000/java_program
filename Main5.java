class Main5{
	public static void main(String args[]){

	int[] arr1={10,20,30,40};
	int sum=0;
	for(int i=0; i<arr1.length; i++){
		sum=sum+arr1[i];
		System.out.println(arr1[i]);
			}
		
	System.out.println(sum);

	float[] arr2={11.2f,12.3f,13.4f,14.5f};
	float sum1=0;
	for(int i=0; i<arr1.length; i++){
		sum1=sum1+arr2[i];
		System.out.println(arr2[i]);
	
	}
	System.out.println("Sum ="+sum1);
	}
}