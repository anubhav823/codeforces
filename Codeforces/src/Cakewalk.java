import java.math.BigInteger;
import java.util.Scanner;

public class Cakewalk {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=0;
    if(sc.hasNextInt())
	    n=sc.nextInt();
	
    BigInteger f = new BigInteger("1");
    BigInteger f1 = new BigInteger("1");
    BigInteger f2=BigInteger.valueOf(21);
    f=f.pow(n-1);
    f1=f1.pow(n);
    BigInteger i=new BigInteger("0");
    for(i.equals(f); i.compareTo(f1) > 0;i=i.add(BigInteger.ONE))
	{
		if(i.remainder(f2).equals(BigInteger.ZERO))
		{
			System.out.println(i);
			break;
			
		}
			
	}
}
}