package structural_patterns.Bridge.v1.abstracts;

/**
 * Абстарктный класс геометрической фигуры
 */
public abstract class Shape {

    protected Color color; // Поле цвета, являющееся мостом для взаимосвязи

    /**
     * Конструктор абстрактной фигуры
     * @param color цвет фигуры
     */
    public Shape(Color color) {
        this.color = color;
    }

    /**
     * Метод рисования фигуры (исп-ся для проверки)
     */
    public abstract void draw();
}
