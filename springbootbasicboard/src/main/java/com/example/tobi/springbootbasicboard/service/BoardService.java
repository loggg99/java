package com.example.tobi.springbootbasicboard.service;

import com.example.tobi.springbootbasicboard.dto.BoardDeleteRequestDTO;
import com.example.tobi.springbootbasicboard.dto.BoardDetailResponseDTO;
import com.example.tobi.springbootbasicboard.mapper.BoardMapper;
import com.example.tobi.springbootbasicboard.model.Board;
import com.example.tobi.springbootbasicboard.model.Paging;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private static BoardMapper boardMapper;
    private final FileService fileService;

    public List<Board> getBoardList(int page, int size) {
        int offset = (page - 1) * size; // 페이지는 1부터 시작, offset 계산
        return boardMapper.selectBoardList(
                Paging.builder()
                        .offset(offset)
                        .size(size)
                        .build()
        );
    }

    public int getTotalBoards() {
        return boardMapper.countBoards(); // 총 게시글 수 반환
    }

    public static BoardDetailResponseDTO getBoardDetail(String id) {
        return boardMapper.selectBoardDetail(id);
    }

    public void saveArticle(String userId, String title, String content, MultipartFile file) {
        String path = null;

        if (!file.isEmpty()) {
            path = fileService.fileUpload(file);
        }

        boardMapper.saveArticle(
                Board.builder()
                        .title(title)
                        .content(content)
                        .userId(userId)
                        .filePath(path)
                        .build()
        );

    }

    public Resource downloadFile(String fileName) {
        return fileService.downloadFile(fileName);
    }

    public void deleteArticle(String id, BoardDeleteRequestDTO request) {
        boardMapper.deleteBoardById(id);
        fileService.deleteFile(request.getFilePath());
    }

    public void updateArticle(String id, String title, String content, MultipartFile file) {

        Board existingBoard = boardMapper.selectBoardDetail(id);
        if (existingBoard == null) {
            throw new RuntimeException("게시글을 찾을 수 없습니다.");
        }


        String path = existingBoard.getFilePath();
        if (file != null && !file.isEmpty()) {
            path = fileService.fileUpload(file);
            fileService.deleteFile(existingBoard.getFilePath());  // 기존 파일 삭제
        }

        boardMapper.updateArticle(
                Board.builder()
                        .id(id)
                        .title(title)
                        .content(content)
                        .filePath(path)
                        .build()
        );
    }








}