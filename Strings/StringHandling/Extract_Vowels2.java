class Extract_Vowels2
 {
    String S;
    String W[]=new String[30];
    int wc=0;
    
    Extract_Vowels2(String S)
    {
        this.S=S;
        for(int i=0;i<30;i++)
        {
            W[i]="";
        }
    }
    
    void extract()
    {
        int k=0;int l=S.length();
        for(int i=0;i<l;i++)
        {
            char x=S.charAt(i);
            if(x==' '||x=='.')k++;
            else W[k]+=x;
        }
        wc=k;
    }
    
    
    void vowel2()
    {
        for(int i=0;i<=wc;i++)
        {
            int c=0;
            for(int j=0;j<W[i].length();j++)
            {
                char x=W[i].charAt(j);
                if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u') c++;
            }
            if(c>=2) System.out.println(W[i]);
        }
    }
    
    public static void main(String args[])
    {
        Extract_Vowels2 ev=new Extract_Vowels2(args[0]);
        ev.extract();
        ev.vowel2();
    }
}