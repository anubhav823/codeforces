import java.util.Scanner;

public class EpicGame {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int n=sc.nextInt();
	int res=0;
	while(n>=0)
	{
		if(n>=gcd(a,n))
		{
			res=gcd(a,n);
			n-=res;
		}
		else if(n<gcd(a,n))
		{
			System.out.println('1');
			break;
		}
		if(n>=gcd(b,n))
		{
			res=gcd(b,n);
			n-=res;
		}
		else if(n<gcd(b,n))
		{
			System.out.println('0');
			break;
		}
			
		
		
	}
}
static int gcd(int ab, int n)
{
	if (ab == 0) 
        return n; 
      if (n == 0) 
        return ab; 
     
      // base case 
      if (ab == n) 
          return ab; 
     
      // a is greater 
      if (ab > n) 
          return gcd(ab-n, n); 
      return gcd(ab, n-ab); 
}
}
