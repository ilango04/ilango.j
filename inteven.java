import java.util.Scanner;
class inteven
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int l=sc.nextInt();
for(int i=s;i<l;i++)
{
if(i%2==0)
{
System.out.print(i);
}
}
}
}
