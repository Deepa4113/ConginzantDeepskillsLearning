package com.cognizant.ormlearn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// @Entity tells Spring Data JPA this is an entity class for the application
// @Table maps this class to the "country" database table
@Entity
@Table(name = "country")
public class Country {

    // @Id marks this field as the primary key
    @Id
    @Column(name = "co_code")
    private String code;

    // @Column maps this field to the "co_name" column
    @Column(name = "co_name")
    private String name;

    public Country() {
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
