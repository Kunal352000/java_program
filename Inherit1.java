class Animal{
	void eat(){
		System.out.println("I am eating");
		}
	}
	
class Dog extends Animal{
	public static void main(String args[]){
		Dog d=new Dog();
		d.eat();
		}
	}