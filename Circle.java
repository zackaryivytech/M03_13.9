public class Circle extends GeometricObject implements Comparable<Circle>{

    public double radius;

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public Circle(){
        radius = 1;
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object circle){
        return ((Circle)circle).radius == radius;
    }

    @Override
    public int compareTo(Circle circle) {
        if(radius < circle.radius)
            return -1;
        else if(radius > circle.radius)
            return 1;
        else
            return 0;
    }
}
