import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeIntegrationTest {

    @Test
    public void testShapesArrayList() {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Circle1", 3.5));
        shapes.add(new Circle("Circle2", 4.2));
        shapes.add(new Rhombus("Rhombus1", 5.0, 6.0, 4.0));
        shapes.add(new Rhombus("Rhombus2", 7.0, 8.0, 5.0));
        shapes.add(new RightAngledTriangle("Triangle1", 3.0, 4.0));
        shapes.add(new RightAngledTriangle("Triangle2", 5.0, 12.0));

        for (Shape shape : shapes) {
            assertNotNull(shape.a());
            assertNotNull(shape.pre());
        }
    }
}
