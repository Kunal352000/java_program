class stringInt{
	public static void main(String args[]){
	
	Scanner x = new Scanner(System.in);
	
	int n=Integer.parseInt(x.nextLine());
	String name=x.nextLine();
	
	System.out.println("Dear"+name+". Here counting start");
	for(int i=1; i<=n; i++){
		System.out.println(i++);
		}
	}
}