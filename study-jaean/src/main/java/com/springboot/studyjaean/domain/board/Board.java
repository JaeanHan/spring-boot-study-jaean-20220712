package com.springboot.studyjaean.domain.board;

import com.springboot.studyjaean.web.controller.dto.board.CreateBoardRespDto;
import com.springboot.studyjaean.web.controller.dto.board.ReadBoardRespDto;
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
    private String title;
    private int usercode;
    private String username;
    private String content;
    private LocalDateTime createdate;
    private LocalDateTime updatedate;

    public CreateBoardRespDto toCreateBoardDto(boolean insertStatus) {
        return CreateBoardRespDto.builder()
                .boardcode(boardcode)
                .title(title)
                .usercode(usercode)
                .content(content)
                .insertStatus(insertStatus)
                .build();
    }

    public ReadBoardRespDto toReadBoardDto() {
        return ReadBoardRespDto.builder()
                .boardcode(boardcode)
                .title(title)
                .usercode(usercode)
                .username(username)
                .content(content)
                .createDate(createdate)
                .build();
    }
}
