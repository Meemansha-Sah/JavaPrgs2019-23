class NumberRanges
{
    static void rangePalindrome(int l,int u)
    {
        System.out.println("Following are the Palindrome numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(Number_Checks.isPalindrome(i)) System.out.println("\t"+i);
        }
    }
    static void rangePerfect(int l,int u)
    {
        System.out.println("Following are the Perfect numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(Number_Checks.isPerfect(i)) System.out.println("\t"+i);
        }
    }
    static void rangeAdam(int l,int u)
    {
        System.out.println("Following are the Adam numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(Number_Checks.isAdam_No(i)) System.out.println("\t"+i);
        }
    }
    static void rangeSmith(int l,int u)
    {
        System.out.println("Following are the Smith numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(Number_Checks.isSmith_No(i)) System.out.println("\t"+i);
        }
    }
    static void rangeArmstrong(int l,int u)
    {
        System.out.println("Following are the Armstrong numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(Number_Checks.isArmstrong(i)) System.out.println("\t"+i);
        }
    }
    static void rangeNarcissistic(int l,int u)
    {
        System.out.println("Following are the Narcissistic numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(Number_Checks.isNarcissistic(i)) System.out.println("\t"+i);
        }
    }
    static void rangeDudeney(int l,int u)
    {
        System.out.println("Following are the Dudeney numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(Number_Checks.isDudeney(i)) System.out.println("\t"+i);
        }
    }
    static void rangeMagic(int l,int u)
    {
        System.out.println("Following are the Magic numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(Number_Checks.isMagic(i)) System.out.println("\t"+i);
        }
    }
    static void rangeAbundant(int l,int u)
    {
        System.out.println("Following are the Abundant numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(Number_Checks.isAbundant(i)) System.out.println("\t"+i);
        }
    }
    static void rangeAutomorphic(int l,int u)
    {
        System.out.println("Following are the Automorphic numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(Number_Checks.isAutomorphic(i)) System.out.println("\t"+i);
        }
    }
    static void rangeNivenNo(int l,int u)
    {
        System.out.println("Following are the NivenNo numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(Number_Checks.isNivenNo(i)) System.out.println("\t"+i);
        }
    }
    static void rangeAmicable(int l,int u)
    {
        System.out.println("Following are the Amicable numbers between "+l+" and "+u);
        for(int i=l;i<=u;i++)
        {
            if(Number_Checks.isAmicable(i)) System.out.println("\t"+i);
        }
    }
}