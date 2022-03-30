package com.example.appwarehouse.projection.attachment;

import com.example.appwarehouse.model.entity.attachment.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface AttachmentProjection {
    Long getId();
    String getName();
    String getOriginalName();
    String getContentType();
    Long getSize();
}
