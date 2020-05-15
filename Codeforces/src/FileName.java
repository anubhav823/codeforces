import java.util.Scanner;

public class FileName {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String s=sc.next();
	int count=0;
	if(!s.contains("xxx"))
		count=0;
	else
	{
		while(s.contains("xxx"))
		{
			s=s.replaceFirst("x","");
			count++;
		}
	}
	System.out.println(count);
}
//100
//uxxxxxlmexxxxxxxwnxxexxxxxcxxfydxxxxxxvmdxxxxxxisxxxxxxxxidkxxxpxxxxxxxxmnuxxxxjxxxqcxxwmxxxxxxxxmrx

}
