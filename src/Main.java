public class Main {
    public static void main(String[] args) {
        try {
            Triangle a = new Triangle(3, 1, 5);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}