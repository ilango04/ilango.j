import java.util.Scanner;
class same
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        String c="",b=null;
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
          c="";
            b=a[0];
           for(int j=0;j<b.length();j++)
            {
                 if(b.substring(j,j+1).equals(a[i].substring(j,j+1)))
                 {
                 c+=b.substring(j,j+1);
                 }
                 else
                 break;
            }
        }
        System.out.print(c);
    }
}
