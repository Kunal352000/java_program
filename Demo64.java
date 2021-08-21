class Demo64{
	public static void main(String args[]){
	
	int x=4;
	int y=8;

	x+=y;
	y=x-y;
	x-=y;

	System.out.println("x="+x);
	System.out.println("y="+y);
	}
}