package com.company.Airoport.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airoport {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String city;
    private String country;

    private String icao;
    private String iata;

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }



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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
