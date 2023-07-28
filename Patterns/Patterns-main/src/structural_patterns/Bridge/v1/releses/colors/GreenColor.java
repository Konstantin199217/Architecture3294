package structural_patterns.Bridge.v1.releses.colors;

import structural_patterns.Bridge.v1.abstracts.Color;

/**
 * Зеленый цвет
 */
public class GreenColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Заливка зеленым цветом");
    }
}
