package numberProgram;

public class StrongNumber {
  public static void main(String[] args){
	 int num=145;
	 int sum=0;
	 int copy=num;
	 while(num>0){
		 int n=num%10;
		 int fact=1;
		 while(n>0){
			 fact=fact*n;
			 n--;
		 }
		 sum=sum+fact;
		 num=num/10;
	 }
	 if(copy==sum){
		 System.out.println("strong number");
	 }
	 else
	 {
		 System.out.println("not strong number");
	 }
  }
}
