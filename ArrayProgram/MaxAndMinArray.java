package ArrayProgram;

public class MaxAndMinArray {
   public static void main(String[] args){
	   int[] arr={10,20,30,40,50};
	   int max=arr[0];
	   int min=arr[1];
	   for(int i=0;i<arr.length;i++){
		   if(arr[i]>max){
			   max=arr[i];
		   }
		   else if(arr[i]<min){
			   min=arr[i];
		   }
	   }
	   System.out.println("max array="+max);
	   System.out.println("min array="+min);
   }
}
