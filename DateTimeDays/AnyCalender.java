/*This prg is based on a formula:
 * (Year Code + Month Code + Century Code + Date Number - Leap Year Code)% 7
 * which can be used to find the day on any date.
 * 
 * How to Calculate the Day of the Week from Any Date(Procedure)-
 *  <https://artofmemory.com/blog/how-to-calculate-the-day-of-the-week/> (biblography)
*/
import java.util.Scanner;
public class AnyCalender
{
    int YearCode,CenturyCode,MonthCode,DateNumber,LeapYearCode,Day_No,Month;
    boolean LeapYear,J_F;
    String Day;
    private void Year_Cent(int yr)
    {
        int Cent=yr/100;
        if(Cent==17||Cent==21||Cent==25||Cent==29||Cent==33)    CenturyCode=4;
        if(Cent==18||Cent==22||Cent==26||Cent==30||Cent==34)    CenturyCode=2;
        if(Cent==19||Cent==23||Cent==27||Cent==31||Cent==35)    CenturyCode=0;
        if(Cent==20||Cent==24||Cent==28||Cent==32||Cent==36)    CenturyCode=6;
        
        int YY=yr%(Cent*100);
        YearCode=(YY+(YY/4))%7;
        if(yr%4!=0) LeapYear=false;
        else if(yr%4==0)
        {
            if(yr%100!=0) LeapYear=true;
            else if(yr%100==0)
            {
                if(yr%400==0) LeapYear=true;
                if(yr%400!=0) LeapYear=false;
            }
        }
        if(LeapYear==true)    LeapYearCode=1;
        if(LeapYear==false)   LeapYearCode=0;
    }
    private void MONTH(int month)
    {
        if (month>12) System.out.println("Invalid Month");
        Month=month;
        if(month==1||month==10) MonthCode=0;
        if(month==2||month==3||month==11) MonthCode=3;
        if(month==4||month==7) MonthCode=6;
        if(month==5) MonthCode=1;
        if(month==6) MonthCode=4;
        if(month==8) MonthCode=2;
        if(month==9||month==12) MonthCode=5;
        if(month==1||month==2)  J_F=true;
    }
    private void Calculate()
    {
        DateNumber=1;
        if(LeapYearCode==1 && J_F==true)  LeapYearCode=1;
        else                              LeapYearCode=0;
        
        Day_No=(YearCode+MonthCode+CenturyCode+DateNumber-LeapYearCode)%7;
    }
    private void SMTWTFS()
    {
        System.out.println("");
        System.out.print("\tSUN\t");
        System.out.print("MON\t");
        System.out.print("TUES\t");
        System.out.print("WED\t");
        System.out.print("THUS\t");
        System.out.print("FRI\t");
        System.out.print("SAT\t");
        System.out.println("");
    }
    private void whichDay1()
    {
        if(Day_No==0) 
        {System.out.print("\t 1 ");}
        if(Day_No==1) 
        {System.out.print("\t   ");
         System.out.print("\t 1 ");}
        if(Day_No==2)
        {System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t 1  ");}
        if(Day_No==3)
        {System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t 1 ");}
        if(Day_No==4)
        {System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t 1  ");}
        if(Day_No==5)
        {System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t 1 ");}
        if(Day_No==6)
        {System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t   ");
         System.out.print("\t 1 ");}
    }
    private void printingDays_n_dates()
    {
        int date=DateNumber+1;
        int day=Day_No+1;
        int Mdays=0;
        if(Month%2==0)
        {
            if(LeapYearCode==1 && Month/2==1) Mdays=29;
            else if(LeapYearCode==0 && Month/2==1) Mdays=28;
        }
        if(Month==1||Month==3||Month==5||Month==7||Month==8||Month==10||Month==12) Mdays=31;
        if(Month==4||Month==6||Month==9||Month==11) Mdays=30;
        
        for(int i=1;i<Mdays;i++)
        {
            if(day>6) 
            {
                day%=7;
                System.out.println("");
            }
            System.out.print("\t "+date+" ");
            date++;
            day++;
        }
    }
    public void main()
    {
        System.out.println((char)12);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year in YYYY format");
        int year=input.nextInt();
        Year_Cent(year);
        
        System.out.println("Enter Month no.");
        int Month=input.nextInt();
        MONTH(Month);
        
        Calculate();
        SMTWTFS();
        whichDay1();
        printingDays_n_dates();
    }
}   //THIS PRG WAS MADE IN THE DECEMBER OF 2020