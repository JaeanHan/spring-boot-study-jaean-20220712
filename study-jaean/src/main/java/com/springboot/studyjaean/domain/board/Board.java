package com.springboot.studyjaean.domain.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board {
    private int boardcode;
    private int usercode;
    private String title;
    private String content;
    private LocalDateTime createdate;
    private LocalDateTime updatedate;
}
