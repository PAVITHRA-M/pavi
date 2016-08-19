import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {    
        String c;
       Scanner in=new Scanner(System.in);
        c=in.next();
        System.out.println("Enter the string");
        
        if(c.equalsIgnoreCase("a")||c.equalsIgnoreCase("e")||c.equalsIgnoreCase("i")||c.equalsIgnoreCase("o")||c.equalsIgnoreCase("u"))
        {
            System.out.println("Vowels");
        }
            else
        {
             System.out.println("constant");
        }
        
        
    }
    

    
}
