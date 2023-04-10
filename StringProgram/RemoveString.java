 package StringProgram;

public class RemoveString {
    public static void main(String[] args){
    	 String s1="vickky";
    	 String s2="";
    	 for(int i=0;i<s1.length()-1;i++){
    		 if(s1.charAt(i)!=s1.charAt(i+1)){
    			 s2=s2+s1.charAt(i);
    		 }
    	 }
    	 s2=s2+s1.charAt(s1.length()-1);
    	 System.out.println(s2);
    }
}
