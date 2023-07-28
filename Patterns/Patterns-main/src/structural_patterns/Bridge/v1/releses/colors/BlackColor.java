package structural_patterns.Bridge.v1.releses.colors;

import structural_patterns.Bridge.v1.abstracts.Color;

/**
 * Черный цвет
 */
public class BlackColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Заливка черным цветом");
    }
}
