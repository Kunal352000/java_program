class InitObjByMethod{
	String color;
	int age;
	void initObj(String c,int a){
	color=c;
	age=a;
	}
	
	void display(){
		System.out.println(color+ " "+age);
		}
		
	public static void main(String[] args){
		InitObjByMethod buzo=new InitObjByMethod();
		buzo.initObj("blue",10);
		buzo.display();
		}
		}