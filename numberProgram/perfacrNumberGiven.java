package numberProgram;
import java.util.Scanner;
public class perfacrNumberGiven {
    public static void main(String[]args){
    	Scanner scn=new Scanner(System.in);
    	int[]arr={1,2,6,18,21,70,28};
    	for(int i=0;i<arr.length;i++){
    		CheckPerfact(arr[i]);
    	}
    }
    public static void CheckPerfact(int num){
    	int sum=0;
    	for(int i=1;i<num;i++){
    		if(num%i==0){
    			sum=sum+i;
    		}
    	}
    	if(sum==num){
    		System.out.println(sum);   // 1,2,3=6 this perfact number
    	}
    }
}
