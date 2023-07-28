package behavioral_patterns.itertaor;

/**
 * Интерфейс итератора, реализующий логику итератора
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
}
