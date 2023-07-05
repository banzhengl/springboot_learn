package com.springboot.demo.event;

import com.springboot.demo.domain.ImageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author banzh
 */
@Slf4j
@Component
public class MyEventListener {

    @EventListener(ImageAddEvent.class)
    public void onImageEvent(ImageAddEvent event) {
        ImageInfo source = (ImageInfo) event.getSource();
        log.info("insert :{}", source.getName());
    }

    @EventListener(ImageSelectEvent.class)
    public void onImageSelectEvent(ImageSelectEvent event) {
        ImageInfo source = (ImageInfo) event.getSource();
        log.info("get :{}", source.getName());
    }
}
