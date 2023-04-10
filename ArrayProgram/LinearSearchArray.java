package ArrayProgram;
import java.util.Scanner;
public class LinearSearchArray {
   public static void main(String[] args){
	   Scanner scn=new Scanner(System.in);
	   int[] arr={1,2,3,4,5};
	   System.out.println("enter the number");
	   int key=scn.nextInt();
	   for(int i=0;i<arr.length;i++){
		   if(key==arr[i]){
			   System.out.println("linearSerarchArray="+i);
		   }
	   }
   }
}
