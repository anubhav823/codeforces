import java.util.ArrayList;
import java.util.Scanner;
 
public final class Cards {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k,n,m,t,ct=0;
        long p,q,c=1,mod=1000000000,r,a;
        ArrayList<Long> al=new ArrayList<Long>();
        while(true)
        { p=c*(3*c+1);
        q=p/2;
            if(q<=mod)
            al.add(q);
            else
            break;
            c++;
        }
        t=sc.nextInt();
        for(i=0;i<t;i++)
        {r=sc.nextLong();
        ct=0;
          for(j=al.size()-1;j>=0;j--)
          {  a=al.get(j);
              if((r/a)!=0)
              { ct+=r/a;
                  r=r%a;
              }
              if(r==0)
              break;
          }
            System.out.println(ct);
        }
             
         
     }
 }
