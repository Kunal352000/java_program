class Demo130{
	public static void main(String args[]){

	int x=3;
	int y;
	y = x++ + ++x + x++ + ++x;

	System.out.println(x);
	System.out.println(y);

	y = ++x - x++ + ++x + x++;
	System.out.println(x);
	System.out.println(y);
	}
}