package com.example.irwancannady.jadwalbioskop.model;

import java.util.List;

/**
 * Created by irwancannady on 9/19/16.
 */
public class Movie {


    private String status;
    private String kota;
    private String date;
    private List<MovieData> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<MovieData> getData() {
        return data;
    }

    public void setData(List<MovieData> data) {
        this.data = data;
    }
}
