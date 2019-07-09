package com.example.upload.controller;

import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import sun.rmi.runtime.Log;

@RestController
public class FeignUploadController {

    protected final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value = "/uploadFile/server", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String fileUploadServer(MultipartFile file ) throws Exception{
        logger.info("TTTT");
        return file.getOriginalFilename();
    }

}
