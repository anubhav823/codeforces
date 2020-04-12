import java.util.Scanner;

public class Substring {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int pos=0;
	int pos1=0;
	for(int i=0;i<s.length()-2;i++)
	{
		if(s.substring(i,2)=="AB" || s.substring(i,2)=="BA")
		{
			pos=i;
		}
		if(s.substring(i,2)=="BA" || s.substring(i,2)=="AB")
		{
			pos1=i;
		}
		if(pos==(pos1-2) || pos==(pos1+2))
			System.out.println("YES");
		else if(pos1==(pos-2) || pos1==(pos+2))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
}
