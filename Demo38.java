class Demo38{
	public static void main(String args[]){

	int x=8;
	int y=6;

	System.out.println("x="+x);
	System.out.println("y="+y);

	x=x*y; //x=48
	y=x/y; //y=8
	x=x/y; //x=6

	System.out.println("After Swapping:");
	System.out.println("x="+x);
	System.out.println("y="+y);

	}
}