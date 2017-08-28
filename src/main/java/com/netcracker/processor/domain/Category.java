package com.netcracker.processor.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


public class Category {

    private Integer id;
    private String name;

    @JsonIgnore
    private List<Offer> offerList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Offer> getOfferList() {
        return offerList;
    }

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }

}
