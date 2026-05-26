package com.acropolis.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.acropolis.api.dto.RequestDTO;
import com.acropolis.api.dto.ResponseDTO;
import com.acropolis.api.service.DataProcessingService;

@RestController
public class DataController {

    @Autowired
    private DataProcessingService service;

    @PostMapping("/bfhl")
    public ResponseDTO processData(@RequestBody RequestDTO request) {
        return service.processArray(request.getData());
    }
}
