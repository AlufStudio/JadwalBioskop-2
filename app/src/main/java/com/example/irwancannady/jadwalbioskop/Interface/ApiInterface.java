package com.example.irwancannady.jadwalbioskop.Interface;

import com.example.irwancannady.jadwalbioskop.model.City;
import com.example.irwancannady.jadwalbioskop.model.Movie;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by irwancannady on 9/19/16.
 */
public interface ApiInterface {

    @GET("api/jadwal-bioskop")
    Call<City> getCity();

    @GET("api/jadwal-bioskop")
    Call<Movie> getMovie(@Query("id") String id);
}
