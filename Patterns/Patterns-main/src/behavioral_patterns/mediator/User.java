package behavioral_patterns.mediator;

/**
 * Абстрактный класс пользователя
 * У каждого пользователя есть ссылка на объект-посредник ChatMediator
 * он необходим для связи между разными пользователями
 */
public abstract class User {
    protected ChatMediator chatMediator;
    protected String name;

    /**
     * Конструктор классов пользователей
     * @param chatMediator медиатор
     * @param name имя пользователя
     */
    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    /**
     * Абстрактный метод отправки сообщений
     * @param message сообщение
     */
    public abstract void send(String message);

    /**
     * Абстрактный метод получения сообщений
     * @param message сообщение
     */
    public abstract void receive(String message);
}
