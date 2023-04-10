package ArrayProgram;
import java.util.Scanner;
public class IndexOfArray {
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int[] arr={1,2,3,4,5,6};
    System.out.println("enter the number");
    int index=scn.nextInt();
    if(index>=0&&index<arr.length){
    	for(int i=0;i<arr.length;i++){
    		if(index==i){
    			System.out.println("array index ="+arr[i]);
    		}
    		
    	}
    }
    
    }
}
