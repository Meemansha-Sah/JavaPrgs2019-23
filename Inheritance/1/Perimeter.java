class Perimeter extends Rectangle
{
    double P;
    Perimeter(double x,double y)
    {
        super(x,y);
        P=2*(L+B);
    }
    void display()
    {
        super.display();
        System.out.println("Perimeter= "+P);
    }
}