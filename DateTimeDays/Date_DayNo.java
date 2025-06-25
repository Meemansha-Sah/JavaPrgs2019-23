 import java.util.Scanner;
class Date_DayNo
{
     int M[],DD,MM,YYYY,DN;
    Date_DayNo()
    {
        int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        M=a;
    }
     void enterDate()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Date in");
        System.out.println("DD/MM/YYYY  format.");
        String D=in.next();
        String temp=D.substring(0,2);
        DD=Integer.parseInt(temp);
        
        temp=D.substring(3,5);
        MM=Integer.parseInt(temp);
        
        temp=D.substring(6);
        YYYY=Integer.parseInt(temp);
    }
    int convertDayNo()
    {
        
        for(int i=1;i<MM;i++)
        {
            DN+=M[i];
        }
        DN+=DD;
        return DN;
    }
    void isLeap()
    {
        if (YYYY%400==0 ||(YYYY%100!=0 && YYYY%4==0)) M[2]+=1;
    }
    public static void main()
    {
        Date_DayNo d=new Date_DayNo();
        d.enterDate();
        d.isLeap();
        d.convertDayNo();
    }
}