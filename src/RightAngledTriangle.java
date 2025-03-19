public class RightAngledTriangle extends Shape {
    private double base;
    private double height;
    private double hypo;

    public RightAngledTriangle(String name, double base, double height, double hypo) {
        this.base = base;
        this.height = height;
        this.hypo = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        super(name);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getHypu() {
        return hypo;
    }

    public void setbase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setHyp(double hypo) {
        this.hypo = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

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
