import java.util.Scanner;
class Q2_11
{
    String S[];
    Q2_11(int n)
    {
        S=new String[n];
    }
    void input()
    {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<S.length;i++)
        {
            S[i]=in.nextLine();
        }
    }
    void printEncoded(String s)
    {
        String n="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.' || s.charAt(i)==' ') 
            {
                n+=s.charAt(i);
                continue;
            }
            int p=s.charAt(i);
            p+=2;
            if(p>90) p-=26;
            n+=(char)p;
        }
        System.out.println(n);
    }
    void print()
    {
        for(int i=0;i<S.length;i++)
        {
            if(i%2==0) printEncoded(S[i]);
            else System.out.println(S[i]);
        }
    }
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("n=");
        int n=in.nextInt();
        if(n<1||n>10) 
        {
            System.out.print("INVALID ENTRY");
            return;
        }
        Q2_11 s=new Q2_11(n);
        System.out.println(" ");
        s.input();
        System.out.println(" ");
        s.print();
    }
}