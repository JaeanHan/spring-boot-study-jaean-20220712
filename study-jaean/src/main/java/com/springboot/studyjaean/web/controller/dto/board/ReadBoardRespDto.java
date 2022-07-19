package com.springboot.studyjaean.web.controller.dto.board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ReadBoardRespDto {
    private int boardcode;
    private String title;
    private int usercode;
    private String username;
    private String content;
    private LocalDateTime createDate;
}
