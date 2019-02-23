import java.util.Scanner;
class expo
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n2=sc.nextInt();
int e=1;
while(n2!=0)
{
e=e*n;
}
System.out.print(e);
}
}
