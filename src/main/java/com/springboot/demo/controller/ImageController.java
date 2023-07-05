package com.springboot.demo.controller;

import com.springboot.demo.domain.ImageInfo;
import com.springboot.demo.service.ImageService;
import com.springboot.demo.util.ImageUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author banzh
 */
@Slf4j
@RestController
@RequestMapping("/image")
public class ImageController {
    @Autowired
    ImageService imageService;

    @RequestMapping(method = RequestMethod.POST)
    public String insertImage(@RequestBody ImageInfo image) {
        imageService.insertImage(image);
        return "insert success";
    }

    @RequestMapping(method = RequestMethod.GET)
    public ImageInfo getImage(String name) {
        return imageService.getImageByName(name);
    }

    @RequestMapping(value = "/stream", method = RequestMethod.GET)
    public void getStream(String path) throws IOException {
        FileInputStream fileInputStream = ImageUtil.readImage(path);
        log.info("=======fileInputStream========:{}",fileInputStream.available());
        ImageUtil.readBin2Image(fileInputStream,"C:/Users/banzh/Desktop/tt.png");
    }
}
