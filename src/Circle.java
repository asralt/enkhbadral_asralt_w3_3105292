//Asralt Enkhbadral 3105292
public class Circle extends Shape {
    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    @Override
    public double a() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double pre() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + r;
    }

}
