package behavioral_patterns.mediator;

/**
 * Интерфейс медиатор определяющий методы для конкретных последователей
 */
public interface ChatMediator {
    /**
     * Метод отправки сообщений
     * @param message сообщение
     * @param user пользователь для которого предназначено сообщение
     */
    public void sendMessage(String message, User user);
    public void addUser(User user);
}
