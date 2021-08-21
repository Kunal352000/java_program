class Demo133{
	public static void main(String args[]){

	int x=2;
	int y=5;
	int z;

	z=x-- + ++x + y++ + --x + ++y;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);}}