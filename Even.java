import java.util.Scanner;
class Even
{
	public static void main(String[] arg)
	{
		Integer x,y,cnt=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enetr the two Ranges");
		x=in.nextInt();
		y=in.nextInt();
		for(int i=x;i<=y;i++)
		{
			if(i%2==0)
				cnt++;
		}
		System.out.println("Number of Even numbers in the Range"+" "+cnt);
	}
}