package com.example.fastcampusmysql.domain.member.dto;

public record RegisterMemberCommand (
        String email,
        String nickname,
        String birthday) {

}
