package com.springboot.studyjaean.domain.board;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {
    int save(Board board);

    Board findBoardByBoardcode(int boardcode);

    List<Board> getBoardListOfIndex(int index);
}
