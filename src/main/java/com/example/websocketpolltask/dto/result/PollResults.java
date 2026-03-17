package com.example.websocketpolltask.dto.result;


import com.example.websocketpolltask.dto.poll.OptionDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PollResults {
    private Map<String, Integer> results;
}
