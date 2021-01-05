public class Triangle {
    private double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b<= 0 || c<=0) {
            throw new IllegalTriangleException("Canh la so am");
        }
        if (a+b<=c || b+c<=a || a+c <= b){
            throw new IllegalTriangleException("Day khong phai 3 canh cua tam giac");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}