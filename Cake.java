class Cake{
	String cakeName,flavour;
	int price;
	String isAvailable;
	}
	
class Main{
	public static void main(String args[]){
		Cake myCake=new Cake();
		myCake.cakeName="blackforest";
		myCake.flavour="choclate";
		myCake.price=400;
		myCake.isAvailable="yes";
		
		System.out.println(	myCake.cakeName+" "+myCake.flavour+" "+	myCake.price+" "+myCake.isAvailable);}}