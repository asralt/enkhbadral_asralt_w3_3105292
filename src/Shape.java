//Asralt Enkhbadral 3105292

//https://github.com/asralt/enkhbadral_asralt_w3_3105292
//this is public repo anyone can access it 
public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double a();

    public abstract double pre();

    public String toString() {
        return "shape is " + name;
    }

}