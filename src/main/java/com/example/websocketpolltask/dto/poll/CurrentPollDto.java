package com.example.websocketpolltask.dto.poll;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurrentPollDto {
    private String question;
    private List<OptionDto> options;
}
