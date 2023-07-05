package com.springboot.demo.service;

import com.springboot.demo.domain.ImageInfo;
import org.springframework.stereotype.Service;

@Service
public interface ImageService {
    void insertImage(ImageInfo imageInfo);

    ImageInfo getImageByName(String name);

}
