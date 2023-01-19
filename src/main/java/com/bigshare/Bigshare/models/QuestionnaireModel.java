package com.bigshare.Bigshare.models;

public class QuestionnaireModel {

    private String comment;
    private String company;
    private String email;
    private String name;
    private String phone;
    private Questionnaire questionnaire;

    public QuestionnaireModel() {
    }

    public QuestionnaireModel(String comment, String company, String email, String name, String phone, Questionnaire questionnaire) {
        this.comment = comment;
        this.company = company;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.questionnaire = questionnaire;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    @Override
    public String toString() {
        return "QuestionnaireModel{" +
                "comment='" + comment + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", questionnaire=" + questionnaire +
                '}';
    }
}
