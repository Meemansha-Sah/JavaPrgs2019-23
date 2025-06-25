class Encrypt
{
    String C;
    String D;
    int shift;
    Encrypt(String input,int s)
    {
        C=input;
        D="";
        shift=s-1;
    }
    void decode()
    {
        for(int i=0;i<C.length();i++)
        {
            if((i+1)%6==0) continue;
            int n=(int)C.charAt(i)+(shift);
            if (n==81 && (int)C.charAt(i+1)+(shift)==81) 
            {
                D=D+" "; i++;
                continue;
            }
            if(n>90) n=65+(n-90);
            D=D+(char)n;
            //System.out.println(D);
            System.out.println(n+" - "+(char)n);
        }
    }
}