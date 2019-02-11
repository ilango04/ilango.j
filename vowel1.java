import java.util.Scanner;
class vowel1
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if((c>='a')&&(c<='z'))
{
if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
System.out.print("Vowel");
else
System.out.print("Consonant");
}
else
System.out.print("invalid");
}
}
