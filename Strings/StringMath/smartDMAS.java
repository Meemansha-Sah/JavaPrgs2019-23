class smartDMAS
{
    public static void calc(String exp)
    {
        int L=exp.length();
        String N[]=new String[2];
        N[0]="";N[1]="";
        int k=0; char o=' ';
        for(int i=0;i<L;i++)
        {
            char x=exp.charAt(i);
            if(x=='+' || x=='-'||x=='x'|| x=='/')
            {k++;o=x;}
            else {N[k]+=x;}
        }
        int a=Integer.parseInt(N[0]);
        int b=Integer.parseInt(N[1]);
        
        switch(0)
        {
            case '+':
                System.out.println(exp+" "+(a+b));
                break;
            
            case '-':
                System.out.println(exp+" "+(a-b));
                break;
                
            case 'x':
                System.out.println(exp+" "+(a*b));
                break;
                
            case '/':
                System.out.println(exp+" "+(a/b));
                break;
        }
    }
}