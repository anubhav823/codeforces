import java.util.Scanner;

public class DieRoll {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int y=sc.nextInt();
	int w=sc.nextInt();
	int res=Math.max(y, w);
	int g=gcd(res-1,6);
	if(g==0)
		g=1;
	if((6-(res-1))/g==(6/g))
		System.out.println("1/1");
	else
	System.out.println((6-(res-1))/g+"/"+(6/g));
	
}
static int gcd(int a,int b) 
{ 
    // Everything divides 0  
    if (a == 0 || b == 0) 
        return 0; 
      
    // base case 
    if (a == b) 
        return a; 
      
    // a is greater 
    if (a > b) 
        return gcd(a-b, b); 
              
    return gcd(a, b-a); 
}

}
