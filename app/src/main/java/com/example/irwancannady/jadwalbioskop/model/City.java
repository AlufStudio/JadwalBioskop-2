package com.example.irwancannady.jadwalbioskop.model;

import java.util.List;

/**
 * Created by irwancannady on 9/19/16.
 */
public class City {

    private String status;
    private List<CityData> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CityData> getData() {
        return data;
    }

    public void setData(List<CityData> data) {
        this.data = data;
    }
}
