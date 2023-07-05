package com.springboot.demo.event;

import com.springboot.demo.domain.ImageInfo;
import org.springframework.context.ApplicationEvent;

/**
 * @author banzh
 * 事件类
 */
public class ImageAddEvent extends ApplicationEvent {

    public ImageAddEvent(ImageInfo source) {
        super(source);
    }
}
