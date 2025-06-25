class ToBinary
{
    public static int decimal_binary(int D)
    {
        int B=0;int p=0;
        while(D>0)
        {
            int d=D%2;
            B+=d*(Math.pow(10,p));
            D/=2; p++;
        }
        return B;
    }
    public static void octal_binary(int O)
    {
        int B=0;int p=0;
        while(O>0)
        {
            int d=O%10; int dB=decimal_binary(d);
            B+=dB*(Math.pow(1000,p));
            O/=10; p++;
        }
        System.out.println(B);
    }
    public static void hexa_binary(int H)
    {
        int B=0;int p=0;
        while(H>0)
        {
            int d=H%10; int dB=decimal_binary(d);
            B+=dB*(Math.pow(1000,p));
            H/=10; p++;
        }
        System.out.println(B);
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