class Q1_11
{
    int n;
    String w;
    Q1_11(int N)
    {
        n=N;
        w="";
    }
    private String toWords(int N)
    {
        if(N==1) return "ONE";
        else if(N==2) return "TWO";
        else if(N==3) return "THREE";
        else if(N==4) return "FOUR";
        else if(N==5) return "FIVE";
        else if(N==6) return "SIX";
        else if(N==7) return "SEVEN";
        else if(N==8) return "EIGHT";
        else if(N==9) return "NINE";
        else if(N==10) return "TEN";
        else if(N==11) return "ELEVEN";
        else if(N==12) return "TWELVE";
        else if(N==13) return "THIRTEEN";
        else if(N==14) return "FOURTEEN";
        else if(N==15) return "FIFTEEN";
        else if(N==16) return "SIXTEEN";
        else if(N==17) return "SEVENTEEN";
        else if(N==18) return "EIGTEEN";
        else if(N==19) return "NINETEEN";
        else if(N>19 && N<30) return "TWENTY "+toWords(N%10);
        else if(N>29 && N<40) return "THIRTY "+toWords(N%10);
        else if(N>39 && N<50) return "FOURTY "+toWords(N%10);
        else if(N>49 && N<60) return "FIFTY "+toWords(N%10);
        else if(N>59 && N<70) return "SIXTY "+toWords(N%10);
        else if(N>69 && N<80) return "SEVENTY "+toWords(N%10);
        else if(N>79 && N<90) return "EIGHTY "+toWords(N%10);
        else if(N>89 && N<100) return "NINTY "+toWords(N%10);
        else return "";
    }
    void numToWords()
    {
        w=toWords(n/100);
        if(n>=100)
        {
            w+=" HUNDRED ";
            if(n%100>0)w+="AND ";
        }
        w+=toWords(n%100);
    }
}
