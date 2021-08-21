class Animal
{
	public void eat()
	{
		System.out.println("I am eating");
		}
		
	public void run()
	{
		System.out.println("I am running");
		}
	
	public static void main(String args[])
	{
		System.out.println("one");
		Animal buzo=new Animal();
		buzo.eat();
		Animal buzo1=new Animal();
		buzo1.run();
		Birds sp=new Birds();
		sp.fly();
		}
	
}

class Birds
{
	public void fly(){
	System.out.println("I am flying");
	}
}