package com.rua.test.springboot.web;

import com.rua.test.springboot.domain.posts.Posts;
import com.rua.test.springboot.service.posts.PostsService;
import com.rua.test.springboot.web.dto.PostsResponseDto;
import com.rua.test.springboot.web.dto.PostsSaveRequestDto;
import com.rua.test.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById (@PathVariable Long id) {
        return postsService.findById(id);
    }
}
