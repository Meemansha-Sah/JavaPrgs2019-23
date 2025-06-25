import java.util.Scanner;
class Calculator
   {
    static double X, Y;
    static Scanner in=new Scanner(System.in);
    
    static double sqrt(int x)
    {
        double sq_rt=Math.sqrt(x);
        return sq_rt;
    }
    static double cbrt(int x)
    {
        double cb_rt=Math.cbrt(x);
        return cb_rt;
    }
    static double sqare(int x)
    {
        double sq=x*x;
        return sq;
    }
    static double cube(int x)
    {
        double cu=x*x*x;
        return cu;
    }
    static long nPr(int n, int r)
    {
        long a=1;
        for(int i=n;i>(n-r);i--)
        {
            a*=i;
        }
        return a;
    }
    static double expo(int x,int y)
    {
        double ex=Math.pow(x,y);
        return ex;
    }
    static double Addition(int x,int y)
    {
        double sum=x+y;
        return sum;
    }
    static double Subtraction(int x,int y)
    {
        double sub=x-y;
        return sub;
    }
    static double Multiplication(int x,int y)
    {
        double pro=x*y;
        return pro;
    }
    static double DivisionQ(int x,int y)
    {
        double Q=x/y;
        return Q;
    }
    static double DivisionR(int x,int y)
    {
        double R=x%y;
        return R;
    }
    static double trig_fun(int Theta, int func)
    {
        double out=0;
        switch(func)
        {
            case 1: out= Math.sin(Theta);
            break;
            case 2: out= Math.cos(Theta);
            break;
            case 3: out= Math.tan(Theta);
            break;
            case 4: out= 1/(Math.tan(Theta));
            break;
            case 5: out= 1/(Math.cos(Theta));
            break;
            case 6: out= 1/(Math.sin(Theta));
            break;
        }
        return out;
    }
    public static void main()
    {
        int X=0;int Y=0; double result=0;
        for(;;)
        {   System.out.println((char)12);
            System.out.println("Choose any one of the following by entering the number adjacent to it");
            System.out.println("");
            System.out.println("1.  Square Root       2.  Cube Root");
            System.out.println("3.  Square            4.  Cube");
            System.out.println("5.  Addition          6.  Subtraction");
            System.out.println("7.  Multiplication    8.  Division");
            System.out.println("9.  Exponents         10. Trignometric Values");
            System.out.println("0. Exit");
            int a=in.nextInt();
            if(a==0) return;
            if(a==1||a==2||a==3||a==4)
            {
                System.out.println("Please enter any one number");
                X=in.nextInt();
            }
            if(a==10)
            {
                System.out.println("Please enter any two numbers");
                X=in.nextInt();
                Y=in.nextInt();
            }
            if(a==5||a==6||a==7||a==8||a==9)
            {
                System.out.println("Please enter the no. for trignometric function to be used");
                System.out.println(" 1. sin    2. cos");
                System.out.println(" 3. tan    4. cot");
                System.out.println(" 5. sec    6. cosec");
                Y=in.nextInt();
                System.out.println("Enter the value of Theta");
                X=in.nextInt();
            }
            switch(a)
            {
                case 1:
                result=sqrt(X);
                break; 
                
                case 2:
                result=cbrt(X);
                break; 
                
                case 3:
                result=sqare(X);
                break; 
                
                case 4:
                result=cube(X);
                break; 
                
                case 5:
                result=Addition(X,Y);
                break; 
                
                case 6:
                result=Subtraction(X,Y);
                break; 
                
                case 7:
                result=Multiplication(X,Y);
                break; 
                
                case 8:
                result=DivisionQ(X,Y);
                break; 
                
                case 9:
                result=expo(X,Y);;
                break; 
                
                case 10:
                result=trig_fun(Y,X);
                break; 
            }
        }
    }
}