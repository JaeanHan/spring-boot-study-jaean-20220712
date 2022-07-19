package com.springboot.studyjaean.service.board;

import com.springboot.studyjaean.web.controller.dto.board.CreateBoardReqDto;
import com.springboot.studyjaean.web.controller.dto.board.CreateBoardRespDto;
import com.springboot.studyjaean.web.controller.dto.board.ReadBoardRespDto;

public interface BoardService {
    CreateBoardRespDto createBoard(CreateBoardReqDto createBoardReqDto) throws Exception;

    public ReadBoardRespDto readBoard(int boardcode) throws Exception;
    public ReadBoardRespDto readBoardList(int page) throws Exception;

    boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception;

    boolean deleteBoard(int boardcode) throws Exception;

}
