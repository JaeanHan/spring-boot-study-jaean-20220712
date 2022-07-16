package com.springboot.studyjaean.service.board;

import com.springboot.studyjaean.domain.board.BoardRepository;
import com.springboot.studyjaean.web.controller.dto.board.CreateBoardReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public boolean createBoard(CreateBoardReqDto createBoardReqDto) throws Exception {
        return boardRepository.save(createBoardReqDto.toEntity()) > 0;
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
