package StringProgram;

public class CommonString {
   public static void main(String[] args){
	   String[] s1={"one","two","three","four","five"};
	   String[] s2={"one","two","three"};
	   for(int i=0;i<s1.length;i++){
		   for(int j=0;j<s2.length;j++){
			   if(s1[i]==s2[j]){
				   System.out.println(s1[i]);
			   }
		   }
	   }
   }
}
