package com.exe201.backend.entity;

import lombok.*;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "sub_yards")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubYardEntity {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "parent_yard")
    private String parentYard;
    @Column(name = "type_yard")
    private int typeYard;
    @Column(name = "created_at")
    private Timestamp createAt;
    @Column(name = "is_active")
    @Builder.Default
    private boolean active = true;
    @Column(name = "reference", insertable = false)
    private int reference;
    @Column(name = "is_parent_active")
    @Builder.Default
    private boolean parentActive = true;
    @Column(name = "is_deleted")
    @Builder.Default
    private boolean deleted = false;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
