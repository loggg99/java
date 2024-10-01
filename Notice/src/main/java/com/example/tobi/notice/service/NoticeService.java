package com.example.tobi.notice.service;


import com.example.tobi.notice.dto.NoticeDTO;
import com.example.tobi.notice.mapper.NoticeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoticeService {

    public final NoticeMapper noticeMapper;

    public List<NoticeDTO> getAllNotices() {
        return noticeMapper.getAllNotices();
    }






}
