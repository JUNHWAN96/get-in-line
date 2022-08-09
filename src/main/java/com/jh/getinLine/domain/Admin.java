package com.jh.getinLine.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Admin {
    private Long Id;

    private String Email;
    private String nickName;
    private String password;
    private String phoneNumber;
    private String memo;

    private LocalDateTime createAt;
    private LocalDateTime mofiedAt;
}
