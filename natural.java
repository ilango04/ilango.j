import java.util.Scanner;
class natural
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),sum=0;
for(int i=1;i<=n;i++)
{
sum+=i;
}
System.out.print(sum);
}
}
