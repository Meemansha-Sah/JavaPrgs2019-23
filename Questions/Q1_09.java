import java.util.Scanner;
class Q1_09
{
    int DN,M[],DMY[];
    String Date;
    Q1_09(int DN,int year)
    {
        Date="";
        int m[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        M=m;
        DMY=new int[3];
        DMY[1]=1;
        DMY[2]=year;
        if(year%400==0) M[2]=29;
        else if (year%100!=0 && year%4==0)M[2]=29;
        this.DN=DN;
    }
    void day_date()
    {
        int i=1;
        while(DN>=M[i])
        {
            if(i==12) 
            {
                i=1;
                DMY[2]++;
                DMY[1]-=12;
            }
            DN-=M[i];
            DMY[1]++;
            i++;
        }
        DMY[0]=DN;
        
        
        if(DMY[0]==1 || DMY[0]==21 || DMY[0]==31)  Date=Date+(DMY[0]+"st");
        else if(DMY[0]==2 || DMY[0]==22)  Date=Date+(DMY[0]+"nd");
        else if(DMY[0]==3 || DMY[0]==23)  Date=Date+(DMY[0]+"rd");
        else Date=Date+(DMY[0]+"th");
        Date=Date+" ";
        
        if(DMY[1]==1) Date=Date+"JANUARY ";
        else if (DMY[1]==2) Date=Date+"FEBRUARY ";
        else if (DMY[1]==3) Date=Date+"MARCH ";
        else if (DMY[1]==4) Date=Date+"APRIL ";
        else if (DMY[1]==5) Date=Date+"MAY ";
        else if (DMY[1]==6) Date=Date+"JUNE ";
        else if (DMY[1]==7) Date=Date+"JULY ";
        else if (DMY[1]==8) Date=Date+"AUGUST ";
        else if (DMY[1]==9) Date=Date+"SEPTEMBER ";
        else if (DMY[1]==10) Date=Date+"OCTOBER ";
        else if (DMY[1]==11) Date=Date+"NOVEMBER ";
        else Date=Date+"DECEMBER ";
        
        Date=Date+DMY[2];
    }
    void display()
    {
        System.out.print("  "+Date);
    }
    public static void main()
    {
        Scanner in=new Scanner (System.in);
        System.out.println(" ");
        System.out.print("DAY NUMBER             : ");
        int dn=in.nextInt();
        if(dn>=1 && dn<=366)dn=dn;
        else
        {
            System.out.println("Enter Day no. again; 1<=DN<=366");
            dn=in.nextInt();
        }
        System.out.println(" ");
        System.out.print("YEAR                   : ");
        int y=in.nextInt();
        System.out.println(" ");
        System.out.print("DAY AFTER(N)           : ");
        int N=in.nextInt();
        if(N>=1 && N<=100)N=N;
        else
        {
            System.out.println("Enter value for N again; 1<=N<=100");
            N=in.nextInt();
        }
        Q1_09 D1=new Q1_09(dn,y);
        D1.day_date();
        D1.display();
        Q1_09 D2=new Q1_09((dn+N),y);
        D2.day_date();
        System.out.println(" ");
        System.out.print("DATE AFTER "+N+" DAYS  :");
        D2.display();
    }
}