package com.springboot.demo.service.serviceImpl;

import com.springboot.demo.domain.ImageInfo;
import com.springboot.demo.event.ImageAddEvent;
import com.springboot.demo.event.ImageSelectEvent;
import com.springboot.demo.mapper.ImageMapper;
import com.springboot.demo.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author banzh
 */
@Component
@Slf4j
public class ImageServiceImpl implements ImageService {
    @Autowired
    private ImageMapper imageMapper;

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void insertImage(ImageInfo imageInfo) {
        int i = imageMapper.insertImage(imageInfo);
        //事件发布
        applicationEventPublisher.publishEvent(new ImageAddEvent(imageInfo));
    }

    @Override
    public ImageInfo getImageByName(String name) {
        ImageInfo imageByName = imageMapper.getImageByName(name);
        if (Objects.isNull(imageByName)) {
            return null;
        }
        applicationEventPublisher.publishEvent(new ImageSelectEvent(imageByName));
        return imageByName;
    }
}
