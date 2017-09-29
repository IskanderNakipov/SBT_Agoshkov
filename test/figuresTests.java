import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class figuresTests {

    @Test
    public void testCircle() {
        circle A = new circle();
        double r = 0.9;
        A.R = r;
        assertEquals(Math.PI*r*r, A.area(), 0.01);

    }

    @Test
    public  void testRectangle() {
        double a = 2.0;
        double b = 3.0;
        Rectangle A = new Rectangle();
        A.a = a;
        A.b = b;
        assertEquals(a*b, A.area(),0.01);
    }
    @Test
    public  void testTriangle() {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        Triangle A = new Triangle();
        A.a = a;
        A.b = b;
        A.c = c;
        assertEquals(a*b*0.5, A.area(),0.01);
    }
}
