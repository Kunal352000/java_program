class Demo115{
	public static void main(String args[]){

	int x=2;
	int y;
	y=x++ * ++x;

	System.out.println(x);
	System.out.println(y);

	y=++x * x++;
	System.out.println(x);
	System.out.println(y);
	}
}