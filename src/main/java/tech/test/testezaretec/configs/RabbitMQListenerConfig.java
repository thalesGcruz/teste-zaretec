package tech.test.testezaretec.configs;

// import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
// import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// import tech.test.testezaretec.receive.Receive;

// import org.springframework.amqp.rabbit.connection.ConnectionFactory;

@Configuration
public class RabbitMQListenerConfig {

    // @Bean
    // public SimpleMessageListenerContainer container(
    //     ConnectionFactory connectionFactory,
    //     MessageListenerAdapter listenerAdapter
    //     ){

    //         SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(); 
    //         container.setConnectionFactory(connectionFactory);
    //         container.addQueueNames(RabbitMQConfig.QUEUE_NAME);
    //         container.setMessageListener(listenerAdapter);
    //         return container;
    // }


    // @Bean
    // MessageListenerAdapter listenerAdapter(Receive receive){
    //     return new MessageListenerAdapter(receive, "receiveMessage");
    // }

}
