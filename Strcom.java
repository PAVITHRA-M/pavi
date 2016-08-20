import java.util.Scanner;

public class Strcomp {

   
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String s,s1;
      System.out.println("Enter the two string");
      s=in.nextLine();
     
      s1=in.nextLine();
      if(s.equalsIgnoreCase(s1))
       System.out.println("the string is equal");
      else
           System.out.println("the string is not equal");
    }
    
}
