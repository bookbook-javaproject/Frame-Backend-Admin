package com.frame.admin.domain.post.domain.entity.Post;

import com.frame.admin.domain.post.domain.entity.Post.enums.AccessType;
import com.frame.admin.domain.post.domain.entity.Post.enums.ContentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@Table(name = "tbl_post")
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @Column(name = "post_number")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postNumber;

    @Column(name = "content", length = 1000)
    private String content;

    @Column(name = "content_type")
    @Enumerated(EnumType.STRING)
    private ContentType contentType;

    @Column(name = "access_type")
    @Enumerated(EnumType.STRING)
    private AccessType accessType;

    @Column(name = "writer", length = 255)
    private String writer;

    @Column(name = "created_at")
    @CreatedDate
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
