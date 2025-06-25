class Conversion
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
    public static void binary_octal(int B)
    {
        int O=0;int p=0;
        while(B>0)
        {
            int d=B%1000; int dO=binary_decimal(d);
            O+=dO*(Math.pow(10,p));
            B/=1000; p++;
        }
        System.out.println(O);
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
    public static char hexaDigits(int d)
    {
        char a=' ';
        if(d<=9) a=(char)d;return a;
        
        switch (d)
        {
            case 10:
            a='A';
            break;
            
            case 11:
            a='B';
            break;
            
            case 12:
            a='C';
            break;
            
            case 13:
            a='D';
            break;
            
            case 14:
            a='E';
            break;
            
            case 15:
            a='F';
            break;
        }
        return a;
    }
    public static void binary_hexaDecimal(int B)
    {
        String H="";int p=0; 
        while(B>0)
        {
            int d=B%10000; char dH=hexaDigits(d);
            H+=dH;
            B/=10000; p++;
        }
        System.out.println();
    }
}