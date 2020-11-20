package com.frame.admin.domain.submission.domain.entity;

import com.frame.admin.domain.submission.domain.entity.enums.FavoriteType;
import com.frame.admin.domain.submission.domain.entity.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@Entity
@Table(name = "tbl_user")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String email;

    @Column(nullable = false, length = 60)
    private String password;

    @Column(nullable = false, length = 12)
    private String nickname;

    @Column(nullable = true, length = 255)
    private String description;

    @Enumerated(EnumType.STRING)
    private FavoriteType favoriteType;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    @Column(name = "image_uri", nullable = true)
    private String imageUri;

    public void changeToAuthor() {
        this.userType = UserType.AUTHOR;
    }
}