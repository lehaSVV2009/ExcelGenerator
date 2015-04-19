package com.kadet.memberGenerator.entity;

import java.util.List;

/**
 * Created by AlexSoroka on 4/17/2015.
 */
public class Member {

    private String firstName;
    private String lastName;
    private String title;
    private String company;
    private String email;
    private String phone;
    private String mobile;
    private String role;
    private List<String> groups;

    public Member(String firstName, String lastName, String title, String company, String email, String phone, String mobile, String role, List<String> groups) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.company = company;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.role = role;
        this.groups = groups;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Member{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", role='" + role + '\'' +
                ", groups=" + groups +
                '}';
    }
}
