package com.example.websocketpolltask.repository;

import com.example.websocketpolltask.entity.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {


}
