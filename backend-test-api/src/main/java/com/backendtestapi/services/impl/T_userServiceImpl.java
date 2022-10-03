package com.backendtestapi.services.impl;

import com.backendtestapi.dtos.T_userDto;
import com.backendtestapi.entities.T_user;
import com.backendtestapi.exceptions.InternalServerErrorException;
import com.backendtestapi.exceptions.NotFoundException;
import com.backendtestapi.exceptions.TestException;
import com.backendtestapi.repositories.T_userRepository;
import com.backendtestapi.services.T_userService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class T_userServiceImpl implements T_userService {

    private static final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    private T_userRepository t_userRepository;

    @Transactional
    @Override
    public T_userDto createT_user(T_userDto t_userDto) throws TestException {
        T_user t_user = new T_user();
        t_user.setUid(t_userDto.getUid());
        t_user.setUser(t_userDto.getUser());
        t_user.setEmail(t_userDto.getEmail());
        t_user.setPass(t_userDto.getPass());
        t_user.setAvatar(t_userDto.getAvatar());
        t_user.setRol(t_userDto.getRol());
        t_user.setFullName(t_userDto.getFullName());

        try{
            t_user = t_userRepository.save(t_user);
        }catch (Exception ex){
            throw new InternalServerErrorException("INTERNAL_SERVER_ERROR", "INTERNAL_SERVER_ERROR");
        }
        return modelMapper.map(getT_userEntity(t_user.getId()), T_userDto.class);
    }

    @Override
    public T_userDto getT_userById(Long t_userId) throws TestException {
        T_user t_user = t_userRepository.findById(t_userId)
                .orElseThrow(() -> new NotFoundException("NOT FOUND-404", "PREGUNTA_NOTFOUND-404"));

        try {
            t_user = t_userRepository.save(t_user);
        }catch (Exception ex){
            throw new InternalServerErrorException("INTERNAL_SERVER_ERROR","INTERNAL_SERVER_ERROR");
        }

        return modelMapper.map(getT_userEntity(t_user.getId()), T_userDto.class);
    }

    @Override
    public List<T_userDto> getT_users() throws TestException {
        List<T_user> t_usersEntity = t_userRepository.findAll();
        return t_usersEntity.stream().map(t_user -> modelMapper.map(t_user, T_userDto.class)).collect(Collectors.toList());
    }

    @Override
    public void updateT_user(Long t_userId, T_userDto t_userDto) throws TestException {
        T_user t_user = t_userRepository.findById(t_userId)
                .orElseThrow(() -> new NotFoundException("NOT FOUND-404", "USUARIO_NOTFOUND-404"));
        t_user.setUid(t_userDto.getUid());
        t_user.setUser(t_userDto.getUser());
        t_user.setEmail(t_userDto.getEmail());
        t_user.setPass(t_userDto.getPass());
        t_user.setAvatar(t_userDto.getAvatar());
        t_user.setRol(t_userDto.getRol());
        t_user.setFullName(t_userDto.getFullName());

        try {
            t_user = t_userRepository.save(t_user);
        }catch (Exception ex){
            throw new InternalServerErrorException("INTERNAL_SERVER_ERROR", "INTERNAL_SERVER_ERROR");
        }
    }

    @Override
    public void deleteT_user(Long t_userId) throws TestException {
        try {
            t_userRepository.deleteById(t_userId);
        }catch (Exception ex){
            throw new InternalServerErrorException("INTERNAL_SERVER_ERROR", "INTERNAL_SERVER_ERROR");
        }
    }

    private T_user getT_userEntity(Long t_userId) throws TestException{
        return t_userRepository.findById(t_userId)
                .orElseThrow(() -> new NotFoundException("NOT FOUND-404","T_USER_NOTFOUND-404"));
    }
}
