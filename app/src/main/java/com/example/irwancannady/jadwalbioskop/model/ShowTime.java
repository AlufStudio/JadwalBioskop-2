package com.example.irwancannady.jadwalbioskop.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by irwancannady on 9/19/16.
 */
public class ShowTime implements Parcelable {

    private String bioskop;
    private List<String> jam;
    private String harga;

    public ShowTime() {
    }

    protected ShowTime(Parcel in) {
        this.bioskop = in.readString();
        this.jam = in.createStringArrayList();
        this.harga = in.readString();
    }

    public static final Parcelable.Creator<ShowTime> CREATOR = new Parcelable.Creator<ShowTime>() {
        @Override
        public ShowTime createFromParcel(Parcel source) {
            return new ShowTime(source);
        }
        @Override
        public ShowTime[] newArray(int size) {
            return new ShowTime[size];
        }
    };

    public String getBioskop() {
        return bioskop;
    }

    public void setBioskop(String bioskop) {
        this.bioskop = bioskop;
    }

    public List<String> getJam() {
        return jam;
    }

    public void setJam(List<String> jam) {
        this.jam = jam;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.bioskop);
        dest.writeStringList(this.jam);
        dest.writeString(this.harga);
    }
}