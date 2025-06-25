class Encode
{
    String key,O,E;
    //char A[]=new char[26];
    
    Encode(String k)
    {
        key=k.toUpperCase();
        O="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        E=key;
    }
    void makeSequenceE()
    {
        loopO:
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<key.length();j++)
            {
                if(O.charAt(i)==key.charAt(j)) continue loopO;
            }
            E+=O.charAt(i);
        }
    }
    
    String encodeMessage(String M)
    {
        M=M.toUpperCase();
        String em="";
        for(int i=0;i<M.length();i++)
        {
            char x=M.charAt(i);
            int p=O.indexOf(x);
            em+=E.charAt(p);
        }
        return em;
    }
    
    /*void makeSequence()
    {
       int j=0; 
       for(int i=0;j<key.length();i++,j++)
         A[j]=key.charAt(i);
       
         int u=65;
         for(int i=j;i<26;i++)
          {
           for(int k=0;k<3;k++)
            {
              if(A[i]==A[k]) u++;
            }
           A[i]=(char)u;
        }
        */ 
         
    
}