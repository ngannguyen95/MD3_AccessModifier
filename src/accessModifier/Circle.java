package accessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    //    public double getRadius() {
//        return radius;
//    }


    public void getArea() {
        System.out.println("Area is:  " + (int) (Math.PI * Math.pow(radius, 2)));
    }
}
