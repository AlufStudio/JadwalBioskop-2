package com.example.irwancannady.jadwalbioskop.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by irwancannady on 9/19/16.
 */
public class MovieData implements Parcelable {

    private String movie;
    private String poster;
    private String genre;
    private String duration;
    private List<ShowTime> jadwal;

    public MovieData() {
    }

    protected MovieData(Parcel in) {
        this.movie = in.readString();
        this.poster = in.readString();
        this.genre = in.readString();
        this.duration = in.readString();
        this.jadwal = new ArrayList<ShowTime>();
        in.readList(this.jadwal, ShowTime.class.getClassLoader());
    }

    public static final Parcelable.Creator<MovieData> CREATOR = new Parcelable.Creator<MovieData>() {
        @Override
        public MovieData createFromParcel(Parcel source) {
            return new MovieData(source);
        }
        @Override
        public MovieData[] newArray(int size) {
            return new MovieData[size];
        }
    };

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }


    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<ShowTime> getJadwal() {
        return jadwal;
    }

    public void setJadwal(List<ShowTime> jadwal) {
        this.jadwal = jadwal;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.movie);
        dest.writeString(this.poster);
        dest.writeString(this.genre);
        dest.writeString(this.duration);
        dest.writeList(this.jadwal);
    }
}
