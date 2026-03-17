package com.example.websocketpolltask.service;


import com.example.websocketpolltask.dto.result.PollResults;
import com.example.websocketpolltask.entity.VoteOption;
import com.example.websocketpolltask.repository.VoteOptionRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Data
@AllArgsConstructor
public class VoteService {
    private final VoteOptionRepository voteOptionRepository;

    public PollResults getResults() {
        List<VoteOption> voteOptions = voteOptionRepository.findAllByOrderByIdAsc();

        Map<String,Integer> results = new HashMap<>();
        for (VoteOption voteOption : voteOptions) {
            results.put(voteOption.getOptionText(), voteOption.getVotes());
        }

        return new PollResults(results);
    }

    public PollResults vote(Long optionId) {
        VoteOption option = repository.findById(optionId)
                .orElseThrow(() -> new RuntimeException("Option not found"));

        option.setVotes(option.getVotes() + 1);
        repository.save(option);

        return getResults();
    }
}
