import java.util.ArrayList;
import java.util.Scanner;

public final class Keyboard {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	String s=sc.next();
	ArrayList<Character> arr=new ArrayList<>(k);
	for(int i=0;i<k;i++)
		arr.add(sc.next().charAt(0));
	long ans=0;
	long count=0;
	for(int i=0;i<n;i++)
	{
		if(arr.contains(s.charAt(i)))
		{
			
			count++;
			}
		else if(!arr.contains(s.charAt(i)))
		{
			ans=ans+((count*(count+1))/2);
			count=0;
		}
	}
	ans=ans+(count*(count+1)/2);
	System.out.println(ans);
}
}
