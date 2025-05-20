package shape;

public class Interfaces {

    // Interface
    interface Shape {
        double area();
        double perimeter();
    }

    // Static nested class implementing the interface
    static class Triangle implements Shape {
        double a, b, c;

        Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double area() {
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }

        public double perimeter() {
            return a + b + c;
        }
    }

    // Static main class
    public static class Main {
        public static void main(String[] args) {
            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Area of Triangle: " + triangle.area());
            System.out.println("Perimeter of Triangle: " + triangle.perimeter());
        }
    }
}
