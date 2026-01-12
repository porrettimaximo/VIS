package org.example.vis.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import org.example.vis.domain.enums.AccessResult;

@Entity
@Table(name = "access_logs")
public class AccessLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "membership_id")
    private Membership membership;

    @Column(nullable = false)
    private LocalDateTime accessedAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private AccessResult result;

    @Column(length = 200)
    private String reason;

    private Integer creditsBefore;

    private Integer creditsAfter;

    public AccessLog() {
    }

    public Long getId() {
        return id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public LocalDateTime getAccessedAt() {
        return accessedAt;
    }

    public void setAccessedAt(LocalDateTime accessedAt) {
        this.accessedAt = accessedAt;
    }

    public AccessResult getResult() {
        return result;
    }

    public void setResult(AccessResult result) {
        this.result = result;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getCreditsBefore() {
        return creditsBefore;
    }

    public void setCreditsBefore(Integer creditsBefore) {
        this.creditsBefore = creditsBefore;
    }

    public Integer getCreditsAfter() {
        return creditsAfter;
    }

    public void setCreditsAfter(Integer creditsAfter) {
        this.creditsAfter = creditsAfter;
    }
}
