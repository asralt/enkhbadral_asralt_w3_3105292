//Asralt Enkhbadral 3105292

//https://github.com/asralt/enkhbadral_asralt_w3_3105292
//this is public repo anyone can access it 
public class RightAngledTriangle extends Shape {
    private double base;
    private double height;
    private double hypotenuse;

    public RightAngledTriangle(String name, double base, double height) {
        super(name);
        this.base = base;
        this.height = height;
        this.hypotenuse = Math.sqrt(base * base + height * height);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setBase(double base) {
        this.base = base;
        this.hypotenuse = Math.sqrt(base * base + height * height);
    }

    public void setHeight(double height) {
        this.height = height;
        this.hypotenuse = Math.sqrt(base * base + height * height);
    }

    @Override
    public double a() {
        return (base * height) / 2;
    }

    @Override
    public double pre() {
        return base + height + hypotenuse;
    }

    @Override
    public String toString() {
        return "base: " + base + " height: " + height + "hypo: " + hypotenuse;
    }
}
