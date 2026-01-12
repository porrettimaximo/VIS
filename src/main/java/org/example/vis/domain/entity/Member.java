package org.example.vis.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 20)
    private String memberCode;

    @Column(nullable = false, unique = true, length = 20)
    private String dni;

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 50)
    private String phone;

    @Column(length = 200)
    private String address;

    @Column(length = 200)
    private String email;

    private LocalDate birthDate;

    @Column(length = 100)
    private String emergencyContactName;

    @Column(length = 50)
    private String emergencyContactPhone;

    @Column(length = 500)
    private String photoUrl;

    @Column(nullable = false)
    private boolean active = true;

    @OneToOne(mappedBy = "member")
    private MemberMedicalInfo medicalInfo;

    @OneToMany(mappedBy = "member")
    private List<Membership> memberships = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Payment> payments = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<AccessLog> accessLogs = new ArrayList<>();

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public MemberMedicalInfo getMedicalInfo() {
        return medicalInfo;
    }

    public void setMedicalInfo(MemberMedicalInfo medicalInfo) {
        this.medicalInfo = medicalInfo;
    }

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<AccessLog> getAccessLogs() {
        return accessLogs;
    }

    public void setAccessLogs(List<AccessLog> accessLogs) {
        this.accessLogs = accessLogs;
    }
}
