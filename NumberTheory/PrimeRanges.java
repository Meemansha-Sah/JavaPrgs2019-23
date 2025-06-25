class PrimeRanges
{
    public static void primeR(/*lower limit*/int l,/*upper limit*/int u)
    {
        System.out.println(" Prime numbers between "+l+" and "+ u +" are: ");
        System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            if(Prime_Operations.isPrime(i)) System.out.print(" "+i+",");
        }
    } 
    public static void compositeR(/*lower limit*/int l,/*upper limit*/int u)
    {
        System.out.println(" Composite numbers between "+l+" and "+ u +" are: ");
        System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            if(Prime_Operations.isComposite(i)) System.out.print(" "+i+",");
        }
    }
    public static void semiPrimeR(/*lower limit*/int l,/*upper limit*/int u)
    {
        System.out.println(" Semi-Prime numbers between "+l+" and "+ u +" are: ");
        System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            if(Prime_Operations.isSemiPrime(i)) System.out.print(" "+i+",");
        }
    } 
    public static void circularPrimeR(/*lower limit*/int l,/*upper limit*/int u)
    {
        System.out.println(" Circular-Prime numbers between "+l+" and "+ u +" are: ");
        System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            if(Prime_Operations.isCircularPrime(i)) System.out.print(" "+i+",");
        }
    } 
    public static void twinPrimeR(/*lower limit*/int l,/*upper limit*/int u)
    {
        System.out.println(" Twin-Prime numbers between "+l+" and "+ u +" are: ");
        System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            if(Prime_Operations.isTwinPrime(i)) System.out.print(" "+i+",");
        }
    } 
    public static void cousinPrimeR(/*lower limit*/int l,/*upper limit*/int u)
    {
        System.out.println(" Cousin-Prime numbers between "+l+" and "+ u +" are: ");
        System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            if(Prime_Operations.isCousinPrime(i)) System.out.print(" "+i+",");
        }
    } 
    public static void primeTripletsR(/*lower limit*/int l,/*upper limit*/int u)
    {
        int pT[]=new int[3];
        System.out.println("Sets of Prime Triplets:");
            System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            int c=0;
            if(Prime_Operations.isPrime(i))
            {
                for(int j=0;j<=6;j+=2)
                {
                    if(Prime_Operations.isPrime(i+j)){pT[c]=i+j; c++;if(c==3)break;}
                }
            }
            
            if(c>=3)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(pT[j]+" ");
                }
                System.out.println(" ");
            }
        }
    }
    public static void primeQuadrupletsR(/*lower limit*/int l,/*upper limit*/int u)
    {
        int pT[]=new int[4];
        System.out.println("Sets of Prime Quadruplets:");
            System.out.println(" ");
            if(l<=3) l=4;
        for(int i=l;i<=u;i++)
        {
            int c=0;
            if(Prime_Operations.isPrime(i))
            {
                for(int j=0;j<=8;j++)
                {
                    if(Prime_Operations.isPrime(i+j)){pT[c]=i+j; c++;if(c==4)break;}
                }
            }
            
            if(c>=4)
            {
                for(int j=0;j<4;j++)
                {
                    System.out.print(pT[j]+" ");
                }
                System.out.println(" ");
            }
        }
    }
    public static void chenPrimeR(/*lower limit*/int l,/*upper limit*/int u)
    {
        System.out.println(" Chen-Prime numbers between "+l+" and "+ u +" are: ");
        System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            if(Prime_Operations.isChenPrime(i)) System.out.print(" "+i+",");
        }
    } 
    public static void sophieGermanPrimeR(/*lower limit*/int l,/*upper limit*/int u)
    {
        System.out.println(" Sophie German Prime numbers between "+l+" and "+ u +" are: ");
        System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            if(Prime_Operations.isSophieGermanPrime(i)) System.out.print(" "+i+",");
        }
    } 
    public static void safePrimeR(/*lower limit*/int l,/*upper limit*/int u)
    {
        System.out.println(" Safe-Prime numbers between "+l+" and "+ u +" are: ");
        System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            if(Prime_Operations.isSafePrime(i)) System.out.print(" "+i+",");
        }
    } 
    public static void interPrimeR(/*lower limit*/int l,/*upper limit*/int u)
    {
        System.out.println(" Inter-Prime numbers between "+l+" and "+ u +" are: ");
        System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            if(Prime_Operations.isInterPrime(i)) System.out.print(" "+i+",");
        }
    } 
    public static void emirpPrimeR(/*lower limit*/int l,/*upper limit*/int u)
    {
        System.out.println(" Emirp-Prime numbers between "+l+" and "+ u +" are: ");
        System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            if(Prime_Operations.isEmirpPrime(i)) System.out.print(" "+i+",");
        }
    } 
    public static void palindromicPrimeR(/*lower limit*/int l,/*upper limit*/int u)
    {
        System.out.println(" Palindromic-Prime numbers between "+l+" and "+ u +" are: ");
        System.out.println(" ");
        for(int i=l;i<=u;i++)
        {
            if(Prime_Operations.isPalindromicPrime(i)) System.out.print(" "+i+",");
        }
    } 
}