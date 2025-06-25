class Q3W_09
{
    String Sentence,Words[];
    int wL[],nW;
    Q3W_09(String S)
    {
        Sentence=S;
        Words=new String[10];
        for(int i=0;i<10;i++)
        {
            Words[i]=" ";
        }
    }
    void extract()
    {
        Sentence.trim();
        int k=0;
        for(int i=0;i<Sentence.length();i++)
        {
            char x=Sentence.charAt(i);
            if(x=='.') break;
            if(x==' ') k++;
            else Words[k]+=x;
        }
        nW=k+1;
    }
    void sortWords()
    {
        wL=new int[nW];
        for(int i=0;i<nW;i++)
        {
            wL[i]=Words[i].length();
        }
        
        for(int i=0;i<nW-1;i++)
        {
            for(int j=0;j<nW-i-1;j++)
            {
                if(wL[j]>wL[j+1])
                {
                    int c=wL[j];   String cW=Words[j];
                    wL[j]=wL[j+1]; Words[j]=Words[j+1];
                    wL[j+1]=c;     Words[j+1]=cW;
                }
            }
        }
    }
}