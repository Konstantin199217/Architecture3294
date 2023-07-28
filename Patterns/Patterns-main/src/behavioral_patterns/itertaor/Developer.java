package behavioral_patterns.itertaor;

/**
 * Класс разработчика имеющий в качестве поля коллекцию.
 * Содержит имплантированный метод getIterator для создания итератора вложенного класса.
 */
public class Developer implements Collection{
    private String name;
    private String [] skills;

    public Developer(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }
    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    /**
     * Вложенный класс реализующий итерацию поля skills
     */
    private class SkillIterator implements Iterator{
        private int index;
        @Override
        public boolean hasNext() {
            return index < skills.length;
        }

        @Override
        public Object next() {
            return skills[index++];
        }
    }
}
