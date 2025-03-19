import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    @Test
    public void testC() {
        Circle c1 = new Circle("c1", 3.5);
        assertEquals(38, c1.a());
        assertEquals(3.14, c1.pre());
        assertTrue(c1.toString().contains("c"));
    }

    @Test
    public void testRom() {
        Rhombus rom = new Rhombus("rom", 1.0, 2.0, 3.0);

        assertEquals(1, rom.a());
        assertEquals(12, rom.pre());
        assertTrue(rom.toString().contains("rom"));
    }

    @Test
    public void TestRightAngledTriangle() {
        RightAngledTriangle triangle = new RightAngledTriangle("triangle", 2.0, 3.0);
        assertEquals(6.0, triangle.a());
        assertEquals(7.0, triangle.pre());
    }
}
