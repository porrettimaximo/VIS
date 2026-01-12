package org.example.vis.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "member_medical_info")
public class MemberMedicalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "member_id", nullable = false, unique = true)
    private Member member;

    @Column(length = 1000)
    private String notes;

    @Column(nullable = false)
    private boolean hasMedicalAlert = false;

    @OneToMany(mappedBy = "medicalInfo")
    private List<MedicalDocument> documents = new ArrayList<>();

    public MemberMedicalInfo() {
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isHasMedicalAlert() {
        return hasMedicalAlert;
    }

    public void setHasMedicalAlert(boolean hasMedicalAlert) {
        this.hasMedicalAlert = hasMedicalAlert;
    }

    public List<MedicalDocument> getDocuments() {
        return documents;
    }

    public void setDocuments(List<MedicalDocument> documents) {
        this.documents = documents;
    }
}
