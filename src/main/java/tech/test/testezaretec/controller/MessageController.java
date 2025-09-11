package tech.test.testezaretec.controller;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import tech.test.testezaretec.dto.CreateMessageDto;
import tech.test.testezaretec.entity.MessageEntity;
import tech.test.testezaretec.service.MessageService;

@RestController
@RequestMapping("/v1/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public String index(@RequestParam(value = "status", required = false) String status)
    {
        return "Status recebido: " + status;
    }

    @GetMapping("/{messageID}")
    public Optional<MessageEntity> show(@PathVariable UUID messageID){
      return messageService.show(messageID);
    }

    @PostMapping
    public MessageEntity store(@Valid @RequestBody CreateMessageDto createMessageDto){
        return messageService.createMessage(createMessageDto);
    }

}
