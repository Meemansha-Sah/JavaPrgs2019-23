class ReorderSentenceWords
{
    String S, W[];int l,w;
    ReorderSentenceWords(String s)
    {
        S=s.trim();
        l=S.length();
        
        String words[]=new String[20];
        for(int i=0;i<20;i++)
        {
            words[i]="";
        }
        w=0;
        for(int i=0;i<l;i++)
        {
            char k=S.charAt(i); 
            if(k==',' || k==' ') w++;
            words[w]+=k;
        }
        this.w=w;
        W=words;
    }
    boolean isValid()
    {
        l=S.length();
        char end=S.charAt(l-1);
        if(end!='.'&& end!='?'&& end!='!') return false;
        return false;
    }
    
}