package com.backendtestapi.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class T_userDto {
    private Long id;
    private String uid;
    private String user;
    private String email;
    private String pass;
    private String rol;
    private String fullName;
    private String avatar;
}
