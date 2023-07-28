package structural_patterns.Bridge.v1.releses.shapes;

import structural_patterns.Bridge.v1.abstracts.Color;
import structural_patterns.Bridge.v1.abstracts.Shape;

/**
 * Фигура прямоугольник
 */
public class Rectangle extends Shape {
    public Rectangle(Color color) { // Вызывается родительский конструктор
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Фигура прямоугольник");
        color.fillColor();
    }
}
