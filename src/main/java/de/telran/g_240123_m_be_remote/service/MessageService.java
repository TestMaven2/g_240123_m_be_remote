package de.telran.g_240123_m_be_remote.service;

import de.telran.g_240123_m_be_remote.domain.entity.Message;
import de.telran.g_240123_m_be_remote.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public List<Message> getAll() {
        return repository.findAll();
    }

    public Message getById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Message add(Message message) {
        return repository.save(message);
    }
}