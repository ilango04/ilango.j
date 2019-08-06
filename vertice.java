import java.util.Scanner;
class vertice
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(),b="",d[]=a.split("\\\\n");
        int k=sc.nextInt(),v=sc.nextInt();
        for(int i=0;i<d.length;i++)
        {
            int n=0;
            while(n!=v)
            {
                for(int h=0;h<d[i].length();h++)
                {
                for(int j=0;j<k;j++)
                {
                b+=d[i].charAt(h);
                }
                   }
            b+="\\";
            b+="n";
            n++;
            }
        }
        for(int g=0;g<b.length()-2;g++)
        System.out.print(b.charAt(g));
    }
}
