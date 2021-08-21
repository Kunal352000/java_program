class main15{
	public static void main(String args[]){
	
	add();
	add(10,14);
	add(12.2f,24.5f,76.5f);
	}
	
	public static void add(){
		int sum=5+7;
		System.out.println(sum);
		}
		
	public static void add(int a,int b){
		int sum=a+b;
		System.out.println(sum);
		}
		
	public static void add(float a,float b,float c){
		float sum=a+b+c;
		System.out.println(sum);
		}
		}