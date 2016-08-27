import java.util.Scanner;

public class Strword {

    
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
     String str=in.nextLine();
   String[] str1=str.split(" ");
   int n=str1.length;
   System.out.println("NUMBER OF WORDS IS: "+n);
  }
}
