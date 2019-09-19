package work.java_learn.$pattern.$16mediator;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        ChatCurrent chat = new ChatCurrent();
        Admin admin = new Admin(chat);
        SimpleUser user1 = new SimpleUser(chat);
        SimpleUser user2 = new SimpleUser(chat);

        chat.addUser(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        admin.sendMessage("qwerty");

    }
}

interface User{
    void sendMessage(String message);
    void getMesssage(String message);
}

interface Chat{
    void sendMessageToChat(String message, User user);
}

class Admin implements User{
    Chat chat;

    public Admin(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessageToChat(message, this);
    }

    @Override
    public void getMesssage(String message) {
        System.out.println("admin get message: " + message);
    }
}
class SimpleUser implements User{
    Chat chat;

    public SimpleUser(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessageToChat(message, this);
    }

    @Override
    public void getMesssage(String message) {
        System.out.println(this.getClass().getName() + " get message: " + message);
    }
}

class ChatCurrent implements Chat{

    private List<User> users;

    public ChatCurrent() {
        this.users = new ArrayList();
    }

    void addUser(User user){
        users.add(user);
    }
    void removeUser(User user){
        users.remove(user);
    }

    @Override
    public void sendMessageToChat(String message, User user) {
        for (User u: users){
            if(!u.equals(user)) u.getMesssage(
                    user.getClass().getName() + " send : " + message );
        }
    }
}