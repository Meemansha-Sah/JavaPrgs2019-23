class FromDecimal
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
    
    public static int decimal_octal(int D)
    {
        int O=0;int p=0;
        while(D>0)
        {
            int d=D%8;
            O+=d*(Math.pow(10,p));
            D/=8; p++;
        }
        return O;
    }
    
    public static String decimal_hexa(int D)
    {
        String H="" ; int p=0;
        char h=' ';
        while(D>0)
        {
            int d=D%16;
            if(d>9){ h= hexaDigits(d); H=h+H;}
            else 
               H=d+H;
            D/=16;
        }
        return H;
    }
    
    public static char hexaDigits(int d)
    {
        char a=' ';
        switch(d)
        {
            case 1: case 2: case 3: case 4: case 5: case 6: case 7:case 8:case 9:
            a=(char)(d+48);
            break;
            
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
}