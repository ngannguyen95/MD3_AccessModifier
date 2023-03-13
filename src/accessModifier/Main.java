package accessModifier;

public class Main {
    public static void main(String[] args) {

        Circle testCircle = new Circle(5);
        System.out.println("Radius: "+testCircle.getRadius());
        testCircle.getArea();
    }
}
