package com.springboot.studyjaean.web.controller.api;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/board")
public class BoardController {
    //게시글 작성
    @PostMapping("/content")
    public ResponseEntity<?> addBoard(@RequestParam("title") String title) {
        System.out.println("게시글 작성 요청");
        System.out.println("title: " + title);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "text/html;charset=utf-8");
        return ResponseEntity.ok().headers(headers).body("test OK");
        //return new ResponseEntity<>(title + "게시글 작성 성공", headers, HttpStatus.OK);
    }
    //게시글 조회
    //게시글 수정
    //게시글 삭제
}
