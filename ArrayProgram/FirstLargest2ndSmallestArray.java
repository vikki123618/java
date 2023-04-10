package ArrayProgram;

public class FirstLargest2ndSmallestArray {
     public static void main(String[] args){
    	 int[] arr={1,2,79,9,288};
    	 int flargest=arr[0];
    	 int slargest=arr[1];
    	 for(int i=0;i<arr.length;i++){
    		 if(arr[i]>flargest){
    			 slargest=flargest;
    			 flargest=arr[i];
    		 }
    		 else if(arr[i]>slargest){
    			 slargest=arr[i];
    		 }
    	 }
    	 System.out.println("flargest ="+flargest);
    	 System.out.println("slargest ="+slargest);
     }
}
