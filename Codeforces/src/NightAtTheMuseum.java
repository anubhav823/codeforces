import java.util.Scanner;

public class NightAtTheMuseum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int pos=0;
	int sum=0;
	for(int i=0;i<s.length();i++)
	{
		int ascii=(int)s.charAt(i)-96;
		int min=Math.min(ascii-pos, Math.abs(ascii-26-pos));
		pos=min;
		sum+=min;
	}
	System.out.println(sum);
}
}
