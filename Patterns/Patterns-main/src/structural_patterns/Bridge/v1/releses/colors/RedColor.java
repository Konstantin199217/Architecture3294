package structural_patterns.Bridge.v1.releses.colors;

import structural_patterns.Bridge.v1.abstracts.Color;

/**
 * Красный цвет
 */
public class RedColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Заливка красным цветом");
    }
}
