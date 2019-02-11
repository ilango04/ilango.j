import java.util.Scanner;
class sumoffirst
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int k=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
while(k!=0)
{
sum+=k;
k--;
}
System.out.print(sum);
}
}
