import java.util.Scanner;
class count
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0,r=0;
while(n!=0)
{
r=n%10;
c++;
n=n/10;
}
System.out.print(c);
}
}
