//Asralt Enkhbadral 3105292

//https://github.com/asralt/enkhbadral_asralt_w3_3105292
//this is public repo anyone can access it 
public class Rhombus extends Shape {
    private double diag1;
    private double diag2;
    private double side;

    public Rhombus(String name, double diag1, double diag2, double side) {
        super(name);
        this.diag1 = diag1;
        this.diag2 = diag2;
        this.side = side;

    }

    public double getDiag1() {
        return diag1;
    }

    public double getDiag2() {
        return diag2;
    }

    public double getSide() {
        {
            return side;
        }
    }

    public void setDiag1(double diag1) {
        this.diag1 = diag1;
    }

    public void setDiag2(double diag2) {
        this.diag2 = diag2;
    }

    public void serSide(double side) {
        this.side = side;
    }

    @Override
    public double a() {
        return (diag1 * diag2) / 2;
    }

    @Override
    public double pre() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "diagg" + diag1 + "diag2 " + diag2 + "sides " + side;
    }
}