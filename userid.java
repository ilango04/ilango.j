import java.util.Scanner;
class userid
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String f=sc.nextLine(),l=sc.nextLine(),up="",lo="",u="",fi="";
        int p=sc.nextInt();
        String p1=""+p;
        StringBuffer p2=new StringBuffer(p1);
        p2.reverse();
        String p3=new String(p2);
        int po=sc.nextInt(),c=0;
        if(f.length()>l.length())
        {
         up=l;
         lo=f;
        }
        else if(f.length()==l.length())
        {
            while(c<f.length())
            {
            int n1=(char)(f.charAt(c));
            int n2=(char)(l.charAt(c));
            if(n1>n2)
            {
                up=l;
                lo=f;
                break;
            }
            else if(n1==n2)
            {
                if(c==f.length()-1)
                {
                    up=l;
                    lo=f;
                    break;
                }
                else
                c++;
            }
            else
            {
                up=f;
                lo=l;
                break;
            }
            }
        }
        else
           {
               up=f;
               lo=l;
           }
            u=up.charAt(up.length()-1)+lo+p1.charAt(po-1)+p3.charAt(po-1);
            for(int i=0;i<u.length();i++)
            {
                if(Character.isLowerCase(u.charAt(i)))
                fi+=Character.toUpperCase(u.charAt(i));
                else
                fi+=Character.toLowerCase(u.charAt(i));
            }
            System.out.print(fi);
    }
}






