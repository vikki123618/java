package ArrayProgram;
import java.util.Scanner;
public class Practice {
  public static void main(String[] args){
	  Scanner scn=new Scanner(System.in);
	  int[] arr={1,2,3,4,5,6};
	  System.out.println("enter the number");
	  System.out.println("--------------------------");
	  int key=scn.nextInt();
	  for(int i=0;i<arr.length;i++){
		  if(key==arr[i]){
			  System.out.println("linearSearchArray="+i);
		  }
	  }
  }
}
