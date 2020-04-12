import java.util.Scanner;

public class Lecture {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	String lang1[]=new String[m];
	String lang2[]=new String[m];
	String lecture[]=new String[n];
	String res[]=new String[n];
	for(int i=0;i<m;i++)
	{
		lang1[i]=sc.next();
		lang2[i]=sc.next();
	}
	for(int i=0;i<n;i++)
	{
		lecture[i]=sc.next();
		for(int j=0;j<m;j++) {
		if(lecture[i].equals(lang1[j])|| lecture[i].equals(lang2[j]))
		{
			if(lang1[j].length()>lang2[j].length())
				res[i]=lang2[j];
			else
				res[i]=lang1[j];
		}
	}
	}
	for(int i=0;i<n;i++)
		System.out.print(res[i]+" ");
}
}
