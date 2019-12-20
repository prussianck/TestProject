package com.rua.test.springboot.service.posts;

import com.rua.test.springboot.domain.posts.Posts;
import com.rua.test.springboot.domain.posts.PostsRepository;
import com.rua.test.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postRepository;

    @Transactional
    public Posts save(PostsSaveRequestDto requestDto) {
        return postRepository.save(requestDto.toEntity());
    }
}
