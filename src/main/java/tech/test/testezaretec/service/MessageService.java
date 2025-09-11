package tech.test.testezaretec.service;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.test.testezaretec.dto.CreateMessageDto;
import tech.test.testezaretec.entity.MessageEntity;
import tech.test.testezaretec.enums.MessageStatus;
import tech.test.testezaretec.repository.MessageRepository;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private SendService sendService;

    public void list(){

    }

    public MessageEntity createMessage(CreateMessageDto createMessageDto){
        
        var messageEntity = new MessageEntity(
            null, 
            createMessageDto.phone_number(), 
            createMessageDto.content(),
            MessageStatus.PROCESSING,
            Instant.now(),
            null
        );
        
        var  message = messageRepository.save(messageEntity);   
        sendService.send(message);
        return message;

    }
    
    public Optional<MessageEntity> show(UUID messageUUID){
        var message = messageRepository.findById(messageUUID);
        return message;
    }

}   
