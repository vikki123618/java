package numberProgram;
import java.util.Scanner;   
public class LoginPageSucessfullOrNot {
     public static void main(String[] args){
    	 Scanner scn=new Scanner(System.in);
    	 System.out.println("enter the username");
    	 String username=scn.nextLine();
    	 System.out.println("enter the password");
    	 String password=scn.nextLine();
    	 if((username.equals("vikki"))&&(password.equals("hi baby"))){
    		 System.out.println("successfully login");
    	 }
    	 else
    	 {
    		 System.out.println("username and password incorrect....try again");
    	 }
     }
}
