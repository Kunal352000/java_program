class Demo65{
	public static void main(String args[]){

	int x=2;
	int y=3;

	x+=y;
	x*=y;
	x-=x;
	y*=x;
	x+=y;
	y+=x;

	System.out.println("x="+x);
	System.out.println("y="+y);
	}
}