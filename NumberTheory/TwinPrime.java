// two consequtive odd prime numbers
public class TwinPrime
{
    public static void main()
    {
        System.out.println("Twin Prime Numbers: ");
        for(int i=1;i<100;i+=2)
        {
            if(PrimeNumbers.isPrime(i)&&PrimeNumbers.isPrime(i+2))
            System.out.println(i+" & "+(i+2));
        }
    }
}