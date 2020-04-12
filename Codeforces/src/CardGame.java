import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CardGame {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int flag=0;
	String arr[]=new String[5];
	String s=sc.next();
	for(int i=0;i<5;i++)
		{
			arr[i]=sc.next();
		}
	
	for(int i=0;i<5;i++)
	{
		if(s.charAt(0)==arr[i].charAt(0) || s.charAt(1)==arr[i].charAt(1))
			{
				flag=1;
				break;//rank.contains(s.charAt(0)) +" "+suit.contains(s.charAt(1)));
			}
		else{}// if(!rank.contains(s.charAt(0)) && !suit.contains(s.charAt(1)))
		
	}
	if(flag==1)
		System.out.println("YES");
	else
		System.out.println("NO");
		
}
}
