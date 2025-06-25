class ToDecimal
{
    public static int binary_decimal(int B)
    {
        int D=0;int p=0;
        while(B>0)
        {
            int d=B%10;
            D+=d*(Math.pow(2,p));
            B/=10; p++;
        }
        return D;
    }
    public static int octal_decimal(int O)
    {
        int D=0;int p=0;
        while(O>0)
        {
            int d=O%10;
            D+=d*(Math.pow(8,p));
            O/=10; p++;
        }
        return D;
    }
    public static int hexa_decimal(String H)
    {
        int D=0,l=H.length();
        for(int p=0;p<l;p++)
        {
            char c=H.charAt(p);
            int d=hexaDigits(c);
            D+=d*(Math.pow(16,(l-1-p)));
        }
        return D;
    }
    private static int hexaDigits(char c)
    {
        int a=0;
        
        switch(c)
        {
            case '1':case '2':case '3':case '4':case '5':case '6':case '7':case '8':case '9':
            a=(int)c-48;
            break;
            
            case 'A':
            a=10;
            break;
            
            case 'B':
            a=11;
            break;
            
            case 'C':
            a=12;
            break;
            
            case 'D':
            a=13;
            break;
            
            case 'E':
            a=14;
            break;
            
            case 'F':
            a=15;
            break;
        }
        return a;
    }
}