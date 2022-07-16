package com.springboot.studyjaean.web.controller.api;

import com.springboot.studyjaean.service.board.BoardService;
import com.springboot.studyjaean.web.controller.dto.board.CreateBoardReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    //게시글 작성
    @PostMapping("/content")
    public ResponseEntity<?> addBoard(@RequestBody CreateBoardReqDto createBoardReqDto) {
        boolean responseData = false;

        try {
            responseData = boardService.createBoard(createBoardReqDto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok().body("게시글 작성 " + (responseData ? "성공" : "실패"));
        //return new ResponseEntity<>(title + "게시글 작성 성공", headers, HttpStatus.OK);
    }

    //게시글 조회
    //게시글 수정
    //게시글 삭제
}
