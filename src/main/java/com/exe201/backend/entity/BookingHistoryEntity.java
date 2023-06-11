package com.exe201.backend.entity;

import lombok.*;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "booking_history")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookingHistoryEntity {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "booking_id")
    private String bookingId;
    @Column(name = "reference", insertable = false)
    private int reference;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "note")
    private String note;
    @Column(name = "booking_status")
    private String bookingStatus;
}
