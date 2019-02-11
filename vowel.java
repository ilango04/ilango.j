import java.util.Scanner;
class vowel
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
char a=sc.next().charAt(0);
if((a>='a')&&(a<='z'))
{
if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
System.out.print("Vowel");
else
System.out.print("Consonant");
}
else 
System.out.print("invalid");
}
}
