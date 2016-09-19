package com.example.irwancannady.jadwalbioskop.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by irwancannady on 9/19/16.
 */
public class CityData implements Parcelable {


    private String id;
    private String kota;

    public CityData(){

    }

    protected CityData(Parcel in){
        this.id = in.readString();
        this.kota = in.readString();
    }


    public static final Creator<CityData> CREATOR = new Creator<CityData>() {
        @Override
        public CityData createFromParcel(Parcel in) {
            return new CityData(in);
        }

        @Override
        public CityData[] newArray(int size) {
            return new CityData[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.kota);
    }
}
