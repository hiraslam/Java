package shape;

//Abstract class
 abstract class Shape {
 abstract double area();
 abstract double perimeter();
}

//Concrete subclass: Triangle
class Triangle extends Shape {
 double a, b, c;

 Triangle(double a, double b, double c) {
     this.a = a;
     this.b = b;
     this.c = c;
 }

 double area() {
     double s = (a + b + c) / 2;
     return Math.sqrt(s * (s - a) * (s - b) * (s - c));
 }

 double perimeter() {
     return a + b + c;
 }
}

//Concrete subclass: Square
class Square extends Shape {
 double side;

 Square(double side) {
     this.side = side;
 }

 double area() {
     return side * side;
 }

 double perimeter() {
     return 4 * side;
 }

//Main class to demonstrate dynamic binding
 public class Main {
 public static void main(String[] args) {
     Shape shape1 = new Triangle(3, 4, 5); // Dynamic binding
     Shape shape2 = new Square(6);         // Dynamic binding

     System.out.println("Triangle Area: " + shape1.area());
     System.out.println("Triangle Perimeter: " + shape1.perimeter());

     System.out.println("Square Area: " + shape2.area());
     System.out.println("Square Perimeter: " + shape2.perimeter());
 }
}
}
