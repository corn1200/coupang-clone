package com.kimhs.apis.coupangclone.service;

import com.kimhs.apis.coupangclone.datamodel.dto.Error;
import com.kimhs.apis.coupangclone.exception.ControllableException;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.RestTemplate;

@ControllerAdvice
public class ExceptionService {
    String errorHandlerUrl = "http://122.128.169.32:8080/20406khs";
    RestTemplate restTemplate = new RestTemplate();

    @ExceptionHandler(ControllableException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Error controllableException(ControllableException controllableException) {
        this.sendMessage(String.format("Error[controllableException], %s", controllableException.getMessage()));
        System.out.println("하이 규스비");
        return new Error("controllableException", controllableException.getMessage());
    }

    private void sendMessage(String message) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("message", message);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(this.errorHandlerUrl, request, String.class);
    }

}
