class PrimeCheckC
{ 
public static boolean isPrime(int N)
    {
        int fc=0;
        for(int i=2;i<N/2;i++)
        {
            if(N%i==0) fc++;
        }
        if(fc==0) return true;
        else return false;
    }
    
 public static void main(int N)
    {  
      System.out.println(N+ " is Prime "+ isPrime(N));
    }
}