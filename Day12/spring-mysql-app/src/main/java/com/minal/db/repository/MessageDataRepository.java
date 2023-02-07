package com.minal.db.repository;

import com.minal.db.model.Message;
import com.minal.db.model.Users;
import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface MessageDataRepository extends CrudRepository<Message, Integer> {
}
