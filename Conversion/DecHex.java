class DecHex
{
    int D;
    static String d_h(int n)
    {
        if(n==0) return "";
        String hD="";
        if(n/16<10) hD=""+n/16;
        else if(n/16==10) hD="A";
        else if(n/16==11) hD="B";
        else if(n/16==12) hD="C";
        else if(n/16==13) hD="D";
        else if(n/16==14) hD="E";
        else if(n/16==15) hD="F";
        return d_h(n/16)+hD;
    }
}