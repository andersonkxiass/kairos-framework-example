package br.com.kxiass.model;


import java.time.LocalDate;

/**
 * Created by andersonacs on 13/02/16.
 */
public class Expense {

    private  String description;
    private  String locale;
    private  float value;
    private  LocalDate date;

    public Expense(String description, String locale, float value, LocalDate date ){

        this.description = description;
        this.locale = locale;
        this.value = value;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
