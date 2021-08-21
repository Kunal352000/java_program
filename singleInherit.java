class A{
	void showA(){
		System.out.println("class A method");
		}
	}
	
class B extends A{
	void showB(){
		System.out.println("class B method");
		}
		
	public static void main(String args[]){
		A obj1=new A();
		obj1.showA();
		
		B obj2=new B();
		obj2.showB();
		obj2.showA();
		}
		}