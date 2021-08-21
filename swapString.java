class swapString{
	public static void main(String args[]){
		
	String a="kunal";
	String b="joshi";
	
	a=a+b;
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
	
	System.out.println("after swap " + a);
	System.out.println("after swap " + b);
	}
	}