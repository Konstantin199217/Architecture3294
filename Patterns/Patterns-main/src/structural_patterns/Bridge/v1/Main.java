package structural_patterns.Bridge.v1;

import structural_patterns.Bridge.v1.releses.colors.BlackColor;
import structural_patterns.Bridge.v1.releses.colors.GreenColor;
import structural_patterns.Bridge.v1.releses.colors.RedColor;
import structural_patterns.Bridge.v1.releses.shapes.Rectangle;
import structural_patterns.Bridge.v1.releses.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(new BlackColor());
        Rectangle rectangle1 = new Rectangle(new BlackColor());
        triangle1.draw();
        rectangle1.draw();
        System.out.println("=================================");
        Triangle triangle2 = new Triangle(new RedColor());
        Rectangle rectangle2 = new Rectangle(new RedColor());
        triangle2.draw();
        rectangle2.draw();
        System.out.println("=================================");
        Triangle triangle3 = new Triangle(new GreenColor());
        Rectangle rectangle3 = new Rectangle(new GreenColor());
        triangle3.draw();
        rectangle3.draw();
        System.out.println("=================================");
    }
}
