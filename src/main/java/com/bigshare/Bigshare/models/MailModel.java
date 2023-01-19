package com.bigshare.Bigshare.models;

public class MailModel {

    private String email;
    private String name;
    private String phone;
    private String company;
    private String comment;

    public MailModel() {
    }

    public MailModel(String email, String name, String phone, String company, String comment) {
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.company = company;
        this.comment = comment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
