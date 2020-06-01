public class Circle {
    double radius;

    public double getLength() {
        return Math.PI;
    }

    public double getArea() {
        return getLength() * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();

        circle.radius = 5.0;
//        System.out.println(circle.getArea());

        System.out.println(Math.pow(2, 2));
    }
}
