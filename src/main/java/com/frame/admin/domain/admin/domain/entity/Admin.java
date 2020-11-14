package com.frame.admin.domain.admin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Builder
@Table(name = "tbl_admin")
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    @Id
    private String id;

    @Column(nullable = false, length = 60)
    private String password;
}
