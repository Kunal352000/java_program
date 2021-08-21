class calculator{
	public static void main(String args[]){
	
	add(10,5);
	sub(10,5);
	mul(10,5);
	div(10,5);
	
	}
	
	public static void add(double a,double b){
		double add=a+b;
		System.out.println("add = "+add);
		}
	
	public static void sub(double a,double b){
		double sub=a-b;
		System.out.println("sub = "+sub);
		}	
		
	public static void mul(double a,double b){
		double mul=a*b;
		System.out.println("mul = "+mul);
		}
		
	public static void div(double a,double b){
		double div=a/b;
		System.out.println("div = "+div);
		}
	}