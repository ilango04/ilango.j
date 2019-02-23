import java.util.Scanner;
class prime
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
for(int i=2;i<n/2;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==0)
System.out.println("yes");
else
System.out.println("no");
}
}
