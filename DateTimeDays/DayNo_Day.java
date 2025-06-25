 import java.util.Scanner;
class DayNo_Day
{
     int M[],DD,MM,YYYY,DN;
    DayNo_Day()
    {
        int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        M=a;
        DD=0;
        MM=1;
    }
     void enterYearDayNo()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Year in ");
        System.out.println("YYYY  format.");
        YYYY=in.nextInt();
        
        System.out.println("Enter Day no.");
        DN=in.nextInt();
    }
    void convertToDate()
    {
        int DaysLeft=DN;
        int i=1;
        while(DaysLeft>M[i])
        {
            DaysLeft-=M[i];
            i++;
            MM++;
        }
        DD=DaysLeft;
    }
    void isLeap()
    {
        if (YYYY%400==0 ||(YYYY%100!=0 && YYYY%4==0)) M[2]+=1;
    }
    void displayDate()
    {
        System.out.println("Day No. "+DN+" is:");
        System.out.println("    "+DD+"/"+MM+"/"+YYYY);
    }
    public static void main()
    {
        DayNo_Day d=new DayNo_Day();
        d.enterYearDayNo();
        d.isLeap();
        d.convertToDate();
        d.displayDate();
    }
}