
import java.util.Scanner;
class Palindrome
{
	public static void main(String[]args)
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first String:");
	String s1=sc.nextLine();
	char c[]=s1.toCharArray();
	String s="";
	for(int x=0;x<c.length;x++)
	{
		if((c[x]>=65&&c[x]<=90)||(c[x]>=97&&c[x]<=122))
		{
			s=s+Character.toUpperCase(c[x]);
		}
	}
	System.out.println(s);
	StringBuffer sb=new StringBuffer(s);
	sb.reverse();
	String s2=new String(sb);
	if(s.equals(s2))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("Not palindrome");
	}	
}
}