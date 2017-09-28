public class Triangle {
    double a;
    double b;
    double c;

    public double area() {
        double p = 0.5*(a+b+c);
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
