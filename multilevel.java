class A{
	void showA(){
		System.out.println("a class method");
	}
}

class B extends A{
	void showB(){
		System.out.println("b class method");
	}
}

class C extends B{
	void showC(){
		System.out.println("c class method");
	}
	public static void main(String args[]){
		A obj1=new A();
		obj1.showA();
		System.out.println("---------");
		
		B obj2=new B();
		obj2.showB();
		obj2.showA();
		System.out.println("---------");
		
		C obj3=new C();
		obj3.showA();
		obj3.showB();
		obj3.showC();
		System.out.println("---------");
	}
}