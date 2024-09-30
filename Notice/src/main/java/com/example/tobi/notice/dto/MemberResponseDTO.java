package com.example.tobi.notice.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MemberResponseDTO {
    private Long id;
    private String Name;
    private String Email;
    private String Phone;
    private String password;

}
