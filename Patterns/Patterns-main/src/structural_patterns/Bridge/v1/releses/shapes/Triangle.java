package structural_patterns.Bridge.v1.releses.shapes;

import structural_patterns.Bridge.v1.abstracts.Color;
import structural_patterns.Bridge.v1.abstracts.Shape;

/**
 * Класс треугольника
 */
public class Triangle extends Shape {
    public Triangle(Color color) { // Вызывается родительский конструктор
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Фигура треугольник");
        color.fillColor();
    }
}
