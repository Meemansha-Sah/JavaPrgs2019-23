class Circle
{
    double radius,area;
    final double pi=22/7;
    Circle(double r)
    {
        radius=r;
    }
    void cal_area()
    {
        area=pi*radius*radius;
    }
    void display()
    {
        System.out.println("Area= "+area);
    }
}