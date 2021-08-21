class Demo37{
	public static void main(String args[]){

	int x=8;
	int y=6;

	System.out.println("x="+x);//x=8
	System.out.println("y="+y);//y=6

	x=x+y;//x=14
	y=x-y;//y=8
	x=x-y;//y=6

	System.out.println("After swapping:");
	System.out.println("x="+x);
	System.out.println("y="+y);
	}
}