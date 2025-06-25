import java.util.Scanner;
class Postfix_Output
{
    String postfix,postMod_;
    Postfix_Output(String exp)
    {
        postfix=exp;
        postMod_="";
    }
    void seperateCommas()
    {
        String C="";
        C=C+postfix.charAt(0);
        for(int i=1;i<postfix.length();i++)
        {
            C=C+",";
            C=C+postfix.charAt(i);
        }
        postfix=C;
    }
    boolean isOperator(char c)
    {
        if(c=='+' ||c=='-' ||c=='*' ||c=='/' ||c=='^')
            return true;
        return false;
    }
    /*void replaceValues()
    {
        Scanner in=new Scanner(System.in);
        postMod_=postfix;
        System.out.println("Enter Values");
        System.out.println(" ");
        for(int i=0;i<postMod_.length();i++)
        {
            if(isOperator(postMod_.charAt(i))) continue;
            if(postMod_.charAt(i)==',') continue;
            System.out.print(postMod_.charAt(i)+"= ");
            String X=in.next();
            char x=X.charAt(0);
            postMod_.replace(postMod_.charAt(i),x);
        }
    }*/
    void replaceValues()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Values");
        System.out.println(" ");
        for(int i=0;i<postfix.length();i++)
        {
            char x=postfix.charAt(i);
            if(isOperator(x) || x==',') postMod_+=x;
            else 
            {
                System.out.print(x+"= ");
                String n=in.next();
                postMod_+=n;
            }
        }
    }
    int calculate(int x,int y, char o)
    {
        int A=0;
        if(o=='+') A=x+y;
        else if(o=='-') A=x-y;
        else if(o=='*') A=x*y;
        else if(o=='/') A=x/y;
        else if(o=='^') A=(int)Math.pow(x,y);
        System.out.println("x= "+x+"  y="+y+"  A="+A);
        return A;
    }
    void solve()
    {
        for(int i=0;i<postMod_.length();i++)
        {
            System.out.println(postMod_);
            char c=postMod_.charAt(i);
            System.out.print(c+"  "+i);
            System.out.println("");
            if(c==',') continue;
            if(isOperator(c))
            {
                int x=0,y=0;
                if(i>=5 && postMod_.charAt(i-5)!=',')
                { 
                    if(postMod_.charAt(i-4)!=',')
                      x=Integer.parseInt(postMod_.substring(i-5,i-3));
                    else x=Integer.parseInt(postMod_.substring(i-6,i-4));
                    System.out.println(x);
                }
                else
                {
                    x=(int)postMod_.charAt(i-4);
                    x-=48;
                }
                if(postMod_.charAt(i-3)!=',')
                {
                    if(postMod_.charAt(i-2)!=',')
                      y=Integer.parseInt(postMod_.substring(i-3,i-1));
                    else y=Integer.parseInt(postMod_.substring(i-4,i-2));
                }
                else 
                {
                     y=(int)postMod_.charAt(i-2);
                    y-=48;
                }
                if(x<=9 && y<=9)
                {
                    postMod_=postMod_.substring(0,i-4)+calculate(x,y,c)+postMod_.substring(i+1);
                    i-=4;
                }
                else if(y<=9) 
                {
                    postMod_=postMod_.substring(0,i-5)+calculate(x,y,c)+postMod_.substring(i+1);
                    i-=2;
                }
                System.out.println(postMod_);
            }
        }
    }
}