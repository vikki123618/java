 package numberProgram;

public class AmstronNumber {
 public static void main(String[] args){
	 int num=153;
	 int sum=0;
	 int copy=num;
	 while(num>0){
		 int t=num%10;
		 sum=sum+(t*t*t);
		 num=num/10;
	 }
	 if(copy==sum){
		 System.out.println("amstrong number");
	 }
	 else{
		 System.out.println("not amstrong number");
	 }
 }
}
