import java.util.Scanner;
import java.util.Arrays;
class Anagram
{
	public static void main(String[]args)
	{

	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the first String that is from the primary account:");
	String s1=sc.next();
	System.out.println("Enter the first String that is from the primary account:");


	String s2=sc.next();
	if(s1.length()==s2.length())
	{
		char c[]=s1.toCharArray();
		char d[]=s2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		int count=0;
		for(int x=0;x<c.length;x++)
		{
			if(c[x]==d[x])
			{
				count++;
			}
		}
		if(count==c.length)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}
	else
	{
		System.out.println("Not anagram");
	}
}
}

			