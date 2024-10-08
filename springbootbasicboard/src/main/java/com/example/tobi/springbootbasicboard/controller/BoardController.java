package com.example.tobi.springbootbasicboard.controller;

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

    // 게시글 수정 화면 (추가)
    @GetMapping("/edit")
    public String edit(@RequestParam("id") Long id, HttpSession session, Model model) {
        setSession(session, model);
        model.addAttribute("id", id);
<<<<<<< HEAD
        model.addAttribute("title", boardDetail.getTitle());
        model.addAttribute("content", boardDetail.getContent());
        model.addAttribute("filePath", boardDetail.getFilePath());

=======
>>>>>>> b29413bce51767cd94f899dd65f1a712938d23c7
        return "board-edit";
    }



}