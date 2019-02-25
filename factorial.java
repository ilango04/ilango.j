import java.util.Scanner;
class factorial
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.print(f);
    }
}
