package com.example.websocketpolltask.repository;

import com.example.websocketpolltask.entity.Poll;
import com.example.websocketpolltask.entity.VoteOption;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VoteOptionRepository extends CrudRepository<VoteOption,Long> {

    List<VoteOption> findAllByOrderByIdAsc(Poll poll);

}
