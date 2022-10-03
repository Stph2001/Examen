package com.backendtestapi.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TestResponse<T> {
    private String status;
    private String code;
    private String message;
    private T data;

    public TestResponse(String status, String code, String message){
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
