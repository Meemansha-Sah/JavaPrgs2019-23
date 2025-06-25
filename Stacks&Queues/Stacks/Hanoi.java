class Hanoi
{
    Stack I,M,F;
    int i,m,f;
    Hanoi(int s)
    {
        I=new Stack(s);
        F=new Stack(s);
        M=new Stack(s);
        for(int j=s;j>0;j--)
        {
            I.push(j);
        }
        i=s;
        f=0;
        m=0;
    }
    private int fromI()
    {
        i--;
        return I.pop();
    }
    private void toI(int n)
    {
        I.push(n);
        i++;
    }
    void operateI()
    {
        int t=fromI();

        if(i%2!=0)
        {
            if(F.isUnderflow()||F.S[F.top]>t)
               toF(t);
            else operateF();
        }
        else 
        {
            if(M.isUnderflow()||M.S[M.top]>t)
               toM(t);
            else operateM();
        }
    }
    private int fromM()
    {
        m--;
        return M.pop();
    }
    private void toM(int n)
    {
        M.push(n);
        m++;
    }
    void operateM()
    {
        int t=fromM();
        if(m%2!=0)
        {
            if(F.isUnderflow()||F.S[F.top]>t)
               toF(t);
            else operateF();
        }
        else 
        {
            if(I.isUnderflow()||I.S[I.top]>t)
               toI(t);
            else operateI();
        }
    }
    private int fromF()
    {
        f--;
        return F.pop();
    }
    private void toF(int n)
    {
        F.push(n);
        f++;
    }
    void operateF()
    {
        int t=fromF();
        if(f%2!=0)
        {
            if(M.isUnderflow()||M.S[M.top]>t)
               toM(t);
            else operateM();
        }
        else 
        {
            if(I.isUnderflow()||I.S[I.top]>t)
               toI(t);
            else operateI();
        }
    }
}