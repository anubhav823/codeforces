import java.util.Scanner;

public final class QAQ {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int count=0;
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		{
			for(int k=j+1;k<s.length();k++)
				if(s.charAt(i)=='Q' && s.charAt(j)=='A' && s.charAt(k)=='Q')
					count++;
		}
	}
	System.out.println(count);
		
}
}
