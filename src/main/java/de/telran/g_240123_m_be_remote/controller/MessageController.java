package de.telran.g_240123_m_be_remote.controller;

import de.telran.g_240123_m_be_remote.domain.entity.Message;
import de.telran.g_240123_m_be_remote.service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    private MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping
    public List<Message> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Message getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public Message add(@RequestBody Message message) {
        return service.add(message);
    }

    @GetMapping("/test")
    public String test() {
        return "Hello from app!";
    }
}