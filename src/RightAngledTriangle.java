public class RightAngledTriangle extends Shape {
    private double base;
    private double height;
    private double hypo;

    public RightAngledTriangle(String name, double base, double height, double hypo) {
        super(name);
        this.base = base;
        this.height = height;
        this.hypo = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));

    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getHypo() {
        return hypo;
    }

    public void setBase(double base) {
        this.base = base;
        this.hypo = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

    public void setHeight(double height) {
        this.height = height;
        this.hypo = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

    // public void setHyp(double hypo) {

    // }

    @Override
    public double a() {
        return (base * height) / 2;
    }

    @Override
    public double pre() {
        return base + height + hypo;
    }

    @Override
    public String toString() {
        return "base : " + base + "Heihght : " + height + "Hypo : " + hypo;
    }
}
