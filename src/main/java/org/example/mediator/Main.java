package org.example.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chat = new ChatRoom();

        User sina = new User("Sina", "989128439133");
        User arezoo = new User("Arezoo", "989033494347");

        chat.addUser(sina);
        chat.addUser(arezoo);
        chat.addUser(new User("Sanaz", "989129473107"));

        chat.sendMessage("Salam", sina);
        chat.sendMessage("Aleyk!", arezoo);


    }

}
