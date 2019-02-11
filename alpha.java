import java.util.Scanner;
class alpha
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
char a=sc.next().charAt(0);
if((a>='a')&&(a<='u'))
System.out.print("Alphabet");
else
System.out.print("No");
}
}
