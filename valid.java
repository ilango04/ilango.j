import java.util.Scanner;
class valid
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int p=0,p1=0,p2=0;
        if(a.contains("@"))
        {
            if(a.contains("."))
            {
                for(int i=0;i<a.length();i++)
                {
                    if(a.substring(i,i+1).equals("@"))
                    {
                     p=i;   
                     break;
                    }
                }
                if(a.charAt(0)!='@')
                {
                if(Character.isLetter(a.charAt(p-1))||(a.charAt(p-1)=='.'))
                {
                    p2++;
                }
                }
                else
                {
                    p2=0;
                }
                for(int i=p;i<a.length();i++)
                {
                    if(a.substring(i,i+1).equals("."))
                    p1++;
                }
            }
        }
                if(p2!=0&&p1!=0)
                System.out.print("true");
                else
                System.out.print("false");

    }
}
