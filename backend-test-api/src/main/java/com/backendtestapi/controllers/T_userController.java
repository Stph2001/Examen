package com.backendtestapi.controllers;

import com.backendtestapi.dtos.T_userDto;
import com.backendtestapi.exceptions.TestException;
import com.backendtestapi.responses.TestResponse;
import com.backendtestapi.services.T_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/test"+"/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class T_userController {

    @Autowired
    private T_userService t_userService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/t_users")
    public TestResponse<T_userDto> createT_user(@RequestBody T_userDto t_userDto) throws TestException{
        return new TestResponse<>("Success", String.valueOf(HttpStatus.OK), "OK",
                t_userService.createT_user(t_userDto));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/t_users")
    public TestResponse<List<T_userDto>> getT_users() throws TestException{
        return new TestResponse<>("Success", String.valueOf(HttpStatus.OK), "OKAY", t_userService.getT_users());
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/t_users/{t_userId}")
    public TestResponse<T_userDto> getT_userById(@PathVariable Long t_userId) throws TestException{
        return new TestResponse<>("Success", String.valueOf(HttpStatus.OK), "OK",
                t_userService.getT_userById(t_userId));
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/t_users/{t_userId}")
    public void updateT_user(@PathVariable Long t_userId, @RequestBody T_userDto t_userDto) throws TestException{
        t_userService.updateT_user(t_userId, t_userDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/t_users/{t_userId}")
    public void deleteT_user(@PathVariable Long t_userId) throws TestException{
        t_userService.deleteT_user(t_userId);
    }
}
