class Perfect
{
    int num;
    Perfect(int nn)
    {
        num=nn;
    }
    
    int sumFac(int f)
    {
        if(f==1) return 1;
        if( num%f==0) return f+sumFac(f-1);
        return sumFac(f-1);
    }
    
    boolean isPerfect()
    {
        if(sumFac((num/2)+1)==num) return true;
        return false;
    }
    
    public static void main(int n)
    {
        Perfect N=new Perfect(n);
        if(N.isPerfect()) System.out.println(n+" is a Perfect No.");
        else System.out.println(n+" is not a Perfect No.");
    }
}