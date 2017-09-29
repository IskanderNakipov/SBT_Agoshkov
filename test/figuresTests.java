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

    }
}
