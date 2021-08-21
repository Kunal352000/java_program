class Test{
	void show(int a,String name){
		System.out.println("1");
		}
		
	void show(String name,int a){
		System.out.println("2");
		}
		
	public static void main(String[] args){
		Test t=new Test();
		t.show(10,"kunal");
		t.show("kunal",10);
		}
	}