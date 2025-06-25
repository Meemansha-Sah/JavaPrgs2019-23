public class Cylinder
{
    double radius,height,volume;
    double pi=3.14;
    public Cylinder(double r, double h)
    {
        this.radius=r;
        this.height=h;
    }
    double vol()
    {
        this.volume=pi*height*radius*radius;
        return volume;
    }
    public static void main(double R,double H)
    {
        Cylinder cy=new Cylinder(R,H);
        System.out.println(cy.vol());
    }
}