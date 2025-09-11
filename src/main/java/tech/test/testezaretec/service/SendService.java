package tech.test.testezaretec.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import tech.test.testezaretec.configs.RabbitMQConfig;
import tech.test.testezaretec.dto.MessageSerializeDto;
import tech.test.testezaretec.entity.MessageEntity;

@Service
public class SendService {

    private final RabbitTemplate rabbitTemplate;

    public SendService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void send(MessageEntity message) {
       
        var message_serialize = new MessageSerializeDto(
            message.getId(), 
            message.getPhone_number(),
            message.getContent(),
            message.getStatus()
        );

        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, RabbitMQConfig.ROUTING_KEY, message_serialize);
    }

}
