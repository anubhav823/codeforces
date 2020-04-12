import java.util.Scanner;

public class Keyboard {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String key="qwertyuiopasdfghjkl;zxcvbnm,./";
	String s=sc.next();
	String string=sc.next();
	char ans;
	StringBuilder sb=new StringBuilder();
	if(s.equals("R"))
	{
		for(int i=0;i<string.length();i++)
		{
			ans=string.charAt(i);
			for(int j=0;j<key.length();j++)
			{
				if(ans==key.charAt(j))
				{
					sb.append(key.charAt(j-1));
				}
			}
		}
	}
	else if(s.equals("L"))
	{
		for(int i=0;i<string.length();i++)
		{
			ans=string.charAt(i);
			for(int j=0;j<key.length();j++)
			{
				if(ans==key.charAt(j))
				{
					sb.append(key.charAt(j+1));
				}
			}
		}
	}
	System.out.println(sb.toString());
}
}
