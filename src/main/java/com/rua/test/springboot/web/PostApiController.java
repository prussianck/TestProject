package com.rua.test.springboot.web;

import com.rua.test.springboot.domain.posts.Posts;
import com.rua.test.springboot.service.posts.PostsService;
import com.rua.test.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController

public class PostApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public ResponseEntity<Posts> save(@RequestBody PostsSaveRequestDto requestDto){
        //return postsService.save(requestDto);
        return ResponseEntity.ok(postsService.save(requestDto));
        //return ResponseEntity.ok(1L);
    }
}
