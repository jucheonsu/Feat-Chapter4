package com.example.umc9th.domain.member.entity;

import com.example.umc9th.domain.member.enums.SocialType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Table(name = "social")
public class Social {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "provider", length = 10, nullable = false)
    private SocialType provider;

    @Column(name = "provider_id", nullable = false)
    private String providerId;

    @Column(name = "connected_at", nullable = false)
    private LocalDateTime connectedAt;

}
