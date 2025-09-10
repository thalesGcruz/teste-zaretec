package tech.test.testezaretec.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @GetMapping
    public String index()
    {
        return "API rodando certinho aqui e agora 🚀";
    }

}


