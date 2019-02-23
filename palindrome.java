import java.util.Scanner;
class palindrome
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n1=n;
int sum=0;
int r=0;
while(n!=0)
{
r=n%10;
sum=r+(sum*10);
n=n/10;
}
if(sum==n1)
System.out.println("yes");
else
System.out.println("no");
}
}
