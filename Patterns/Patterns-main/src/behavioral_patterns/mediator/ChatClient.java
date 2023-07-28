package behavioral_patterns.mediator;

/**
 * Класс клиент. Взаимодействие классов происходит через медиатор.
 * Реализует общение пользователей в чате
 */
public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "user1");
        User user2 = new UserImpl(mediator, "user2");
        User user3 = new UserImpl(mediator, "user3");
        User user4 = new UserImpl(mediator, "user4");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        user1.send("Привет!");
    }
}
