package hello.kgs.rabbitmqex.web;

import hello.kgs.rabbitmqex.dto.CustomMessage;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    private static final String TOPIC_EXCHANGE_NAME = "spring-boot-exchange";
    private final RabbitTemplate rabbitTemplate;

    @Autowired
    public CustomController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @GetMapping("/custom-message")
    public String customMessage(@ModelAttribute CustomMessage message) {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_NAME, "foo.bar.baz", message);
        return "ok";
    }
}
