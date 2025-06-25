public class String_Reversed
{
    public static void main(String word)
    {
       int l=word.length();
       for(int i=l-1;i>=0;i--)
       {
           
        System.out.print(word.charAt(i));
        }
      
    }
}