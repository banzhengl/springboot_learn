package com.springboot.demo.event;

import com.springboot.demo.domain.ImageInfo;
import org.springframework.context.ApplicationEvent;

/**
 * @author banzh
 */
public class ImageSelectEvent extends ApplicationEvent {

    public ImageSelectEvent(ImageInfo source) {
        super(source);
    }
}
