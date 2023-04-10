package numberProgram;
import java.util.Scanner;
public class leapYearProgram {
   public static void main(String[] args){
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter the year");
	   System.out.println("--------------------");
	   int year=scn.nextInt();
	   if(year%4==0){
		   System.out.println("this is a leapYear");
	   }
	   else{
		   System.out.println("this is not leapYear");
	   }
   }
}
