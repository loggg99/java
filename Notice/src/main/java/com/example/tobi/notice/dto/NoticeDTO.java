package com.example.tobi.notice.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeDTO {
    private Long id;
    private String title;
    private String content;
    private String author;
    private String date;
}
