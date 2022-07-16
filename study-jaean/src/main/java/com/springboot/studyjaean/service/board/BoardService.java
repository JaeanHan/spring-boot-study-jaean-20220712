package com.springboot.studyjaean.service.board;

import com.springboot.studyjaean.web.controller.dto.board.CreateBoardReqDto;

public interface BoardService {
    boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;

//    public boolean readBoard(CreateBoardReqDto createBoardReqDto) throws Exception;

    boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception;

    boolean deleteBoard(int boardcode) throws Exception;

}
