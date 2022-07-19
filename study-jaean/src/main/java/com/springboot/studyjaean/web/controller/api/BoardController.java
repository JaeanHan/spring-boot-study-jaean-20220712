package com.springboot.studyjaean.web.controller.api;

import com.springboot.studyjaean.service.board.BoardService;
import com.springboot.studyjaean.web.controller.dto.CMRespDto;
import com.springboot.studyjaean.web.controller.dto.board.CreateBoardReqDto;
import com.springboot.studyjaean.web.controller.dto.board.CreateBoardRespDto;
import com.springboot.studyjaean.web.controller.dto.board.ReadBoardRespDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    //게시글 작성
    @PostMapping("/content")
    public ResponseEntity<?> addBoard(@RequestBody CreateBoardReqDto createBoardReqDto) {
        CreateBoardRespDto createBoardRespDto;

        try {
            createBoardRespDto = boardService.createBoard(createBoardReqDto);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.internalServerError().body(new CMRespDto<>(1, "게시글 등록 실패", null));
        }
        return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 등록 성공", createBoardRespDto));
    }

    //게시글 조회
    @GetMapping("/content/{boardcode}")
    public ResponseEntity<?> getBoard(@PathVariable int boardcode) {
        ReadBoardRespDto readBoardRespDto;
        try {
            readBoardRespDto = boardService.readBoard(boardcode);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok().body(new CMRespDto<>(-1, "게시글 조회 실패", null));
        }
        return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 조회 성공", readBoardRespDto));
    }

    @GetMapping("/list")
    public ResponseEntity<?> getBoardList(@RequestParam int page) {

        return ResponseEntity.ok().body(new CMRespDto<>(1, "게시글 리스트 " + page + "불러오기" , null));
    }
    //게시글 수정
    //게시글 삭제
}
