package hello.kgs.rabbitmqex;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerListener {

    @RabbitListener(queues = "spring-boot")
    public void receiveMessage(final CustomMessage message) {
        System.out.println("message = " + message);
    }
}
