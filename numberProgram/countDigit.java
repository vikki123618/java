package numberProgram;

public class countDigit {
   public static void main(String[] args) {
	 int count=0;
	 int num=123;
	 while(num>0){
		 int rem=num%10;
		 count++;
		 num=num/10;
		 
	 }
	 System.out.println(count);
}
}
