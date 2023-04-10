package ArrayProgram;

public class RemoveBublicateArray {
   public static void main(String[] args){
	   int[] a1={1,1,2,2,3,4,5,6};
	   int[] a2=new int[a1.length];
	   int j=0;
	  for(int i=0;i<a1.length-1;i++){
		  if(a1[i]!=a1[i+1]){
			  a2[j]=a1[i];
			  j++;
		  }
	  }
	  a2[j]=a1[a1.length-1];
	  j++;
	  System.out.println("remove dublicate array");
	  System.out.println("------------------------------");
	  for(int i=0;i<j;i++){
		  System.out.println(a2[i]+" ");
	  }
   }
}
