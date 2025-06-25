import java.util.Scanner;
class Q3_11
{
    int dmy[],M[]; // dmy[0]=dd, dmy[1]=, dmy[2]=yyyy   DN-Day No.
    Q3_11()
    {
        dmy=new int[3];
        int m[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        M=m;
    }
    void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your date of birth in dd mm yyyy format");
        for(int i=0;i<3;i++)
        {
            dmy[i]=in.nextInt();
        }
    }
    String isValid()
    {
        if(dmy[2]%400==0) M[2]++;
        else if(dmy[2]%100!=0 && dmy[2]%4==0) M[2]++;
        System.out.print("");
        
        if(dmy[0]<0 ||dmy[0]>M[dmy[1]]) return "INVALID DATE";
        else if(dmy[1]<0 ||dmy[1]>12) return "INVALID DATE";
        else if(dmy[2]<1900 ||dmy[2]>2023) return "INVALID DATE";
        else return "VALID DATE";
    }
    int calcDayNo()
    {
        int DN=0;
        for(int i=1;i<dmy[1];i++)
        {
            DN+=M[i];
        }
        DN+=dmy[0];
        return DN;
    }
    public static void main()
    {
        Q3_11 D=new Q3_11();
        D.input();
        System.out.println(D.isValid());
        if(D.isValid()=="VALID DATE") System.out.println(D.calcDayNo());
    }
}