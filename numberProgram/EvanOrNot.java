package numberProgram;
import java.util.Scanner;
public class EvanOrNot {
   public static void main(String[]args){
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter the number");
	   int num=scn.nextInt();
	   if(num%2==0){
		   System.out.println("even number");
	   }
	   else{
		   System.out.println("odd number");
	   }
	   
   }
}
