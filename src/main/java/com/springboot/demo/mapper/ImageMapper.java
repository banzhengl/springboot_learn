package com.springboot.demo.mapper;

import com.springboot.demo.domain.ImageInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageMapper {

    int insertImage(ImageInfo imageInfo);

    ImageInfo getImageByName(String name);
}
