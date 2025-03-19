
//Asralt Enkhbadral 3105292

//https://github.com/asralt/enkhbadral_asralt_w3_3105292
//this is public repo anyone can access it 
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeIntegrationTest {

    @Test
    public void testShapesArrayList() {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("cir1", 3.5));
        shapes.add(new Circle("cir2", 4.2));
        shapes.add(new Rhombus("rom11", 5.0, 6.0, 4.0));
        shapes.add(new Rhombus("rom22", 7.0, 8.0, 5.0));
        shapes.add(new RightAngledTriangle("triangle1", 3.0, 4.0));
        shapes.add(new RightAngledTriangle("triangle2", 5.0, 12.0));

        for (Shape shape : shapes) {
            assertNotNull(shape.a());
            assertNotNull(shape.pre());
        }
    }
}
