public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(2.0, "Red", false);
        Circle circle2 = new Circle(5.5, "Green", true);

        System.out.println("Circle 1 equals circle 2: " + circle1.equals(circle2));
        System.out.println("Circle 2 equals circle 1: " + circle2.equals(circle1));

        System.out.println("Circle 1 compareTo circle2: " + circle1.compareTo(circle2));
        System.out.println("Circle 2 compareTo circle1: " + circle2.compareTo(circle1));

        System.out.println("Circle 1 area: " + circle1.getArea());
        System.out.println("Circle 2 area: " + circle2.getArea());

        System.out.println("Circle 1 perimeter: " + circle1.getPerimeter());
        System.out.println("Circle 2 perimeter: " + circle2.getPerimeter());
    }
}


