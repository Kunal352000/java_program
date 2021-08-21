import java.util.*;
class st19{
	public static void main(String args[]){
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int st=n/2+1;
	int is=1;
	//int os=0;
	
	for(int i=1; i<=n; i++){
		for(int j=1; j<=st; j++){
			System.out.print("*\t");
			}
			
		for(int j=1; j<=is; j++){
			System.out.print("\t");
			}
		System.out.print("*\t");
		for(int j=1; j>=n/2; j++){
			if(i>1 && i<3){
			System.out.print("\t");
			}
		}
		st-=2;
		is+=2;
		System.out.println();}}}