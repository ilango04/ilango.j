import java.util.Scanner;
class intamstrong
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int l=sc.nextInt(),r=0,mul=1,mu=0,sum=0;
        for(int i=s;i<l;i++)
        {
            int count=0;
            int cp=i;
            int cp1=i;
            int cp2=i;
            while(cp!=0)
            {
                count++;
                cp=cp/10;
            }
            cp=0;
            while(cp1!=0)
            {
                r=cp1%10;
                for(int k=0;k<count;k++)
                {
                mul=mul*r;
                }
                sum=sum+mul;
                r=0;
                cp1=cp1/10;
                mul=1;
            }
            if(sum==cp2)
            {
            System.out.print(sum+" ");
            }
             sum=0;
             count=0;
        }
    }
}
