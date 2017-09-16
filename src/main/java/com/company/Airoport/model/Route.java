package com.company.Airoport.model;

import javax.persistence.*;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Airline airline;

    @ManyToOne
    private Airoport srcAiroport;

    @ManyToOne
    private Airoport dstAiroport;

    private boolean codeshare;

    private int stops;

    private String equipment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Airoport getSrcAiroport() {
        return srcAiroport;
    }

    public void setSrcAiroport(Airoport srcAiroport) {
        this.srcAiroport = srcAiroport;
    }

    public Airoport getDstAiroport() {
        return dstAiroport;
    }

    public void setDstAiroport(Airoport dstAiroport) {
        this.dstAiroport = dstAiroport;
    }

    public boolean isCodeshare() {
        return codeshare;
    }

    public void setCodeshare(boolean codeshare) {
        this.codeshare = codeshare;
    }

    public int getStops() {
        return stops;
    }

    public void setStops(int stops) {
        this.stops = stops;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
}
