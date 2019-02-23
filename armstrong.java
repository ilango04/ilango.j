import java.util.Scanner;
class armstrong
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int c=0,d=0,s1=1,sum=0;
int s3=s;
int s2=s;
while(s!=0)
{
    c++;
    s=s/10;
}
while(s2!=0)
{
    d=s2%10;
for(int i=1;i<=c;i++)
{
    s1=s1*d;
}
sum+=s1;
s2=s2/10;
s1=1;
d=0;
}
if(s3==sum)
System.out.print("yes");
else
System.out.print("no");
}
}
