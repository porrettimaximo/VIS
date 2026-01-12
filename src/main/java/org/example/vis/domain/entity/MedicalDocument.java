package org.example.vis.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "medical_documents")
public class MedicalDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "medical_info_id", nullable = false)
    private MemberMedicalInfo medicalInfo;

    @Column(nullable = false, length = 200)
    private String fileName;

    @Column(nullable = false, length = 500)
    private String storagePath;

    @Column(length = 100)
    private String contentType;

    @Column(nullable = false)
    private LocalDateTime uploadedAt;

    public MedicalDocument() {
    }

    public Long getId() {
        return id;
    }

    public MemberMedicalInfo getMedicalInfo() {
        return medicalInfo;
    }

    public void setMedicalInfo(MemberMedicalInfo medicalInfo) {
        this.medicalInfo = medicalInfo;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(LocalDateTime uploadedAt) {
        this.uploadedAt = uploadedAt;
    }
}
