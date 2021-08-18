package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entitiy) {
        this.id = entitiy.getId();
        this.title = entitiy.getTitle();
        this.content = entitiy.getContent();
        this.author = entitiy.getAuthor();
    }
}
