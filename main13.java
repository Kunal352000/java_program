class main13{
	public static void main(String args[]){
	double si1=calSimInt(10000,3.4f,2);
	System.out.println(si1);
	
	double si2=calSimInt(12000,4.4f,7);
	System.out.println(si2);
	
	double si3=calSimInt(18000,3.4f,2);
	System.out.println(si3);
	
	double si4=calSimInt(14000,3.4f,2);
	System.out.println(si4);
	}
	
	public static double calSimInt(int p,float r,int t){
	
		double si=(p*r*t)/100;
		System.out.println(si);
		return si;
		
		}
	}