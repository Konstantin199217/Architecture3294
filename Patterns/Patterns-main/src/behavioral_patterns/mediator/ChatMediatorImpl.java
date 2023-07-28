package behavioral_patterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Конкретный класс-посредник, имеет список пользователей в группе
 * и предоставляет логику для отправки сообщений пользователям
 */
public class ChatMediatorImpl implements ChatMediator{
    private List<User> users = new ArrayList<>();

    /**
     * Отправляет сообщение всем пользователям кроме пользователя отправившего сообщение
     * @param message сообщение
     * @param user пользователь для которого предназначено сообщение
     */
    @Override
    public void sendMessage(String message, User user) {
        for (User u : this.users){
            if (u != user) u.receive(message);
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
