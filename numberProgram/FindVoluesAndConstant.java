package numberProgram;

public class FindVoluesAndConstant {
   public static void main(String[]args){
	   int vcount=0;
	   int ccount=0;
	   String str="hello world";
	   str=str.toLowerCase();
	   for(int i=0;i<str.length();i++){
		   if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='s'){
			   vcount++;
		   }
		   else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
			   ccount++;
		   }
	   }
	   System.out.println("vcount="+vcount);
	   System.out.println("ccount="+ccount);
   }
}
