package com.example.umc9th.domain.alarm.entity.mapping;

import com.example.umc9th.domain.alarm.entity.Alarm;
import com.example.umc9th.domain.member.entity.Member;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Table(name = "member_alarm")
public class MemberAlarm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_read", nullable = false)
    @Builder.Default
    private Boolean isRead = false;

    // 연관 관계 설정
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    // 연관 관계 설정
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "alarm_id", nullable = false)
    private Alarm alarm;

}
