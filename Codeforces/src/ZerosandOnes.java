import java.util.Scanner;

import java.util.regex.*;
public class ZerosandOnes {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s=sc.next();
	int zerocount=0;
	int onecount=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='0')
			zerocount++;
		else
			onecount++;
}
	System.out.println(s.length()-2*Math.min(onecount, zerocount));
}
}
