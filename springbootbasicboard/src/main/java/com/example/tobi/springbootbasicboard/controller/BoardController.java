package com.example.tobi.springbootbasicboard.controller;

import com.example.tobi.springbootbasicboard.dto.BoardDetailResponseDTO;
import com.example.tobi.springbootbasicboard.service.BoardService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

    @GetMapping("/")
    public String boardList(HttpSession session, Model model) {
        setSession(session, model);
        return "board-list";
    }

    @GetMapping("/detail")
    public String detail(
            @RequestParam("id") Long id,
            HttpSession session,
            Model model
    ) {
        setSession(session, model);
        model.addAttribute("id", id);
        return "board-detail";
    }

    @GetMapping("/write")
    public String write(HttpSession session, Model model) {
        setSession(session, model);
        return "board-write";
    }

    private void setSession(HttpSession session, Model model) {
        String userId = (String) session.getAttribute("userId");
        String userName = (String) session.getAttribute("userName");

        model.addAttribute("userName", userName);
        model.addAttribute("userId", userId);
    }

    @GetMapping("/edit")
    public String edit(@RequestParam("id") String id, Model model) {

        BoardDetailResponseDTO boardDetail = BoardService.getBoardDetail(id);


        model.addAttribute("id", id);
        model.addAttribute("title", boardDetail.getTitle());
        model.addAttribute("content", boardDetail.getContent());
        model.addAttribute("filePath", boardDetail.getFilePath());

        return "board-edit";
    }



}