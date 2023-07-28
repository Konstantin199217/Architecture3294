package behavioral_patterns.mediator;

/**
 * Класс конкретный коллега. Конкретный пользовательский класс.
 */
public class UserImpl extends User{

    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    /**
     * Метод отправки сообщения. !! Общение происходит через медиатор !!
     * @param message сообщение
     */
    @Override
    public void send(String message) {
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " получил сообщение: " + message);
    }
}
