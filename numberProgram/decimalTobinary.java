package numberProgram;

public class decimalTobinary {
   public static void main(String[] args){
	   //decimal to binary
	   int num=35;
	   String bin="";
	   while(num>0){
		   int t=num%2;
		   bin=t+bin;
		   num=num/2;
	   }
	   System.out.println(bin);
	   
	   
   }
}
