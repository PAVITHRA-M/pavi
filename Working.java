import java.util.Scanner;

public class Working {

    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     System.out.println("enter the day");
     String str=in.nextLine();
     if(str.equalsIgnoreCase("monday")||str.equalsIgnoreCase("tuesday")||str.equalsIgnoreCase("wednesday")||str.equalsIgnoreCase("thursday")||str.equalsIgnoreCase("friday"))
         System.out.println("Given day is wroking day");
      if(str.equalsIgnoreCase("sunday")||str.equalsIgnoreCase("saturday"))
             System.out.println("Given day is not a wroking day");
    }
}
