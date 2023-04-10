package numberProgram;
import java.util.Scanner;
public class primeNumberGiven {
  public static void main(String[]args){
	  Scanner scn=new Scanner(System.in);
	  int[] arr={1,2,3,4,5,6,7,88,9};
	  for(int i=0;i<arr.length;i++){
		  CheckPrime(arr[i]);
	  }
  }
  //create main method 2
  public static void CheckPrime(int num){
	  int count=0;
	  for(int i=1;i<=num;i++){
		  if(num%i==0){
			  count++;
		  }
	  }
	  if(count==2){
		  System.out.println(num);
	  }
  }
}
