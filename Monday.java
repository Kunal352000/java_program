import java.util.Scanner;
class Monday{
	public static void main(String args[]){
	
	Scanner x=new Scanner(System.in);
	
	System.out.println("TAX CALCULATOR APP");
	System.out.println("-----WELCOME------");
	
	System.out.println("Enter total person count:");
	int count=x.nextInt();
	
	String[] name=new String[count];
	
	
	long[] income=new long[count];
	for(int i=0; i<count; i++){
		System.out.println("Enter the name"+(i+1));
		name[i]=x.next();
		
		System.out.println("Enter " + name[i] +"'s annual income");
		income[i]=x.nextLong();
		
		System.out.println();
		System.out.println();
				
		
		}
			
		System.out.println("Names with liable taxes:");
		System.out.println("------------------------");
		for(int i=0; i<count; i++){
			calculateText(name[i],income[i]);
			}
		
	
	}
	public static void calculateText(String name,long income){
		if(income>=300000){
			long tax=(income*20/100);
			System.out.println(name+ ": Rs " +tax);
		}
		
		else if(income>=100000 && income<300000){
			long tax=(income*10/100);
				System.out.println(name+ ": Rs " +tax);
			}
			
		else{
			System.out.println(name+ ": Rs 0");
		}
		
	}
	}
	