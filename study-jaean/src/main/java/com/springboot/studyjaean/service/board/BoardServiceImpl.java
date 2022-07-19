package com.springboot.studyjaean.service.board;

import com.springboot.studyjaean.domain.board.Board;
import com.springboot.studyjaean.domain.board.BoardRepository;
import com.springboot.studyjaean.web.controller.dto.board.CreateBoardReqDto;
import com.springboot.studyjaean.web.controller.dto.board.CreateBoardRespDto;
import com.springboot.studyjaean.web.controller.dto.board.ReadBoardRespDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public CreateBoardRespDto createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
        Board boardEntity = createBoardReqDto.toEntity();
        boolean insertStatus = boardRepository.save(boardEntity) > 0;

        return boardEntity.toCreateBoardDto(insertStatus);
    }

    @Override
    public ReadBoardRespDto readBoard(int boardcode) throws Exception {
        return boardRepository.findBoardByBoardcode(boardcode).toReadBoardDto();
    }

    @Override
    public ReadBoardRespDto readBoardList(int page) throws Exception {

        return null;
    }

    @Override
    public boolean updateBoard(int boardcode, CreateBoardReqDto createBoardReqDto) throws Exception {
        return false;
    }

    @Override
    public boolean deleteBoard(int boardcode) throws Exception {
        return false;
    }
}
