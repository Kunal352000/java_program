class Demo134{
	public static void main(String args[]){

	int x=2;
	int y=5;
	y=x-- + ++x + y++ + --x + ++y;
	System.out.println(x);
	System.out.println(y);}}