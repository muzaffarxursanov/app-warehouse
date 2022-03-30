package com.example.appwarehouse.projection.attachment;

import com.example.appwarehouse.model.entity.attachment.Attachment;
import com.example.appwarehouse.model.entity.attachment.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentProjection {
    Long getId();
    Byte[] getContent();
    Attachment getAttachment();
}
