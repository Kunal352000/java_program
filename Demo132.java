class Demo132{
	public static void main(String args[]){

	int x=4;
	int y;
	y=x-- + ++x + x++ + --x;
	System.out.println(x);
	System.out.println(y);

	y=--x - x++ + --x + ++x;
	System.out.println(x);
	System.out.println(y);
	}
}