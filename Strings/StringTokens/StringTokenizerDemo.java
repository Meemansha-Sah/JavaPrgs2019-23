import java.util.*;

class StringTokenizerDemo
{
    public static void main(String S)
    {
        StringTokenizer st=new StringTokenizer(S);
        int n=st.countTokens();
        System.out.println("n="+n);
        for(int i=1;i<=n;i++)
        {
            String W=st.nextToken();
            System.out.println(W);
        }
    }
}