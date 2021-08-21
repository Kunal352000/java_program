class Demo36{
	public static void main(String args[]){

	int x=8;
	int y=6;

	System.out.println("x="+x);//x=8
	System.out.println("y="+y);//y=6
	
	int z;
	z=x;//z=8
	x=y;//x=6
	y=z;//y=8

	System.out.println("After Swapping:");
	System.out.println("x="+x);
	System.out.println("y="+y);
	
	}
}