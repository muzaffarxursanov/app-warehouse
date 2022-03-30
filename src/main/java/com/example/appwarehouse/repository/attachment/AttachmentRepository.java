package com.example.appwarehouse.repository.attachment;

import com.example.appwarehouse.model.entity.attachment.Attachment;
import com.example.appwarehouse.projection.attachment.AttachmentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment", excerptProjection = AttachmentProjection.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
