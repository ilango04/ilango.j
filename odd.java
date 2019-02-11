import java.util.Scanner;
class odd
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n>0)
{
if(n%2==0)
System.out.print("Even");
else
System.out.print("Odd");
}
else 
System.out.print("Invalid");
}
}
