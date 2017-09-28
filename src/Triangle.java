public class Triangle {
    float a;
    float b;
    float c;

    public float area() {
        float p = 0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
