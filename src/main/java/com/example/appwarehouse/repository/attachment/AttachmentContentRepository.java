package com.example.appwarehouse.repository.attachment;

import com.example.appwarehouse.model.entity.attachment.AttachmentContent;
import com.example.appwarehouse.projection.attachment.AttachmentContentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment-content", excerptProjection = AttachmentContentProjection.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Long> {
}
