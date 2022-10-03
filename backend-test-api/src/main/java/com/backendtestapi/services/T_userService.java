package com.backendtestapi.services;

import com.backendtestapi.dtos.T_userDto;
import com.backendtestapi.exceptions.TestException;

import java.util.List;

public interface T_userService {
    T_userDto createT_user(T_userDto t_userDto) throws TestException;
    T_userDto getT_userById(Long t_userId) throws TestException;
    List<T_userDto> getT_users() throws TestException;
    void updateT_user(Long t_userId, T_userDto t_userDto) throws TestException;
    void deleteT_user(Long t_userId) throws TestException;
}
