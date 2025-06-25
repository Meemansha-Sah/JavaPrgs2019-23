import java.util.Scanner;
class Days_Elapsed extends Date_DayNo
{
    int DN1,DN2,DN1_2;
    Days_Elapsed()
    {
        super();
        DN1=0;
        DN2=0;
        DN1_2=0;
    }
    void enter()
    {
        Date_DayNo d1=new Date_DayNo();
        d1.enterDate();
        d1.isLeap();
        DN1=d1.convertDayNo();
        
        Date_DayNo d2=new Date_DayNo();
        d2.enterDate();
        d2.isLeap();
        DN2=d2.convertDayNo();
    }
    void elapsed()
    {
        DN1_2=DN2-DN1;
    }
}