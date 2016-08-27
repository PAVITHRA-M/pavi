import java.util.Scanner;

public class Ascii {

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String str,str1;
    str=in.nextLine();
     str1=str.toLowerCase();
    int cnt=0;
    for(int i=0;i<str1.length();i++)
    {
      cnt=str1.charAt(i);
    System.out.println(cnt);
    }
    }
}
