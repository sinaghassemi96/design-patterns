package org.example.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

    private String name;
    private String phoneNumber;

    public void receiveMessage(String message) {
        System.out.println(message);
    }
}
