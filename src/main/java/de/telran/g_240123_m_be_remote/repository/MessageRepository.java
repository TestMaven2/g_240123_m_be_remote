package de.telran.g_240123_m_be_remote.repository;

import de.telran.g_240123_m_be_remote.domain.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}