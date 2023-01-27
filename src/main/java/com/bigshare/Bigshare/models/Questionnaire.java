package com.bigshare.Bigshare.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "questionnaire")
public class Questionnaire {
    private String budget;
    private String calendar;
    private String service;
    private String size;
    @Id
    @GeneratedValue
    private Long id;

    public Questionnaire() {
    }

    public Questionnaire(String budget, String calendar, String service, String size) {
        this.budget = budget;
        this.calendar = calendar;
        this.service = service;
        this.size = size;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getCalendar() {
        return calendar;
    }

    public void setCalendar(String calendar) {
        this.calendar = calendar;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "budget='" + budget + '\'' +
                ", calendar='" + calendar + '\'' +
                ", service='" + service + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
