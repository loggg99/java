package com.example.tobi.notice.mapper;

import com.example.tobi.notice.dto.NoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {

    List<NoticeDTO> getAllNotices();
    List<NoticeDTO> searchNotices(NoticeDTO noticeDTO);

}
