import java.util.Scanner;
public class Array_Big_Smallest
{
    int A[]; 
    void array_input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Length of Array?");
        int l=in.nextInt();
         A=new  int[l];
        System.out.println("Enter elements in the array now ");
        for(int i=0;i<l;i++)
           A[i]=in.nextInt();
          
    }
    
    void find()
    {
        int s=A[0];
        int b=A[0];
        for(int i=0;i<=A.length-1;i++)
        {
            if(A[i]<s) s=A[i];
            if(A[i]>b) b=A[i];
        }
        System.out.println("smallest= "+ s);
        System.out.println("biggest= "+ b);
    }
    public static void main()
    {
        
    }
}