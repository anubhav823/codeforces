// Working program using Reader Class 
import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 

public class UnitGCD
{ 
	public static void main(String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		try {
			int t=sc.nextInt();
			for(int i=0;i<t;i++)
			{
				int n=sc.nextInt();
				if(n==1)
				{
					System.out.println("1");
					System.out.print("1 1");
					System.out.println();
				}
				else if(n==2)
					{
						System.out.print("1");
						System.out.print("2 1 2");
						System.out.println();
					}
				else if(n==3)
				{
					System.out.print("1");
					System.out.print("3 1 2 3");
					System.out.println();
				}
				else if(n%2==0)
				{
					System.out.println(n/2);
					for(int j=1;j<=n;j=j+2)
					{
						System.out.print("2 "+j+" "+(j+1));
						System.out.println();
						
						
					}
				}
				else
				{
					System.out.println(n/2);
					System.out.print("3 1 2 3");
					System.out.println();
					for(int j=4;j<=n;j=j+2)
					{
						System.out.print("2 "+j+" "+(j+1));
						System.out.println();
					}
					
				}
			}
			}
			catch(Exception e)
			{
				
			}
		}
		}   