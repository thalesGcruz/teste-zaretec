package tech.test.testezaretec.receive;

import org.springframework.stereotype.Component;

@Component
public class Receive {
    public void receiveMessage(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
}
