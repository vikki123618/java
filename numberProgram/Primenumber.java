 package numberProgram;
import java.util.Scanner;
public class Primenumber {
    public static void main(String[] args){
    	Scanner scn=new Scanner(System.in);
    	System.out.println("enter the number");
    	int num=scn.nextInt();
    	int count=0;
    	for(int i=1;i<=num;i++){
    		if(num%i==0){
    			count++;
    		}
    	}
    	if(count==2){
    		System.out.println("primeNumber");
    	}
    	else
    	{
    		System.out.println("not primeNumber");
    	}
    }
}
