class main12{
	public static void main(String args[]){
	calSimInt(1000,1.2f,2);
	calSimInt(2000,2.2f,4);
	calSimInt(3000,3.2f,5);
	}
	
	public static void calSimInt(int p,float r,int t){
		double si=p*r*t/100;
		System.out.println(si);
		}
	}