package studentpercentage;
import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
	
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the Username:");
     String name = s.nextLine();
     System.out.println("Enter the emailid:");
     String mid = s.nextLine();
     System.out.println("Enter the Phoneno:");
     long ph = s.nextLong();
     
     System.out.println("=====User Details=====");
     System.out.println("Username:" +name);
     System.out.println("emailid:" +mid);
     System.out.println("Phone Number:" +ph);
     
     
    
	}

}
