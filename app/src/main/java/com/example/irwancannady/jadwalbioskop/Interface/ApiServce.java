package com.example.irwancannady.jadwalbioskop.Interface;

import com.example.irwancannady.jadwalbioskop.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by irwancannady on 9/19/16.
 */
public class ApiServce {

    private ApiInterface apiInterface;

    public ApiServce(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .client(configureTimeOut())
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiInterface = retrofit.create(ApiInterface.class);
    }

    private OkHttpClient configureTimeOut(){

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(90, TimeUnit.SECONDS)
                .build();

        return  okHttpClient;
    }

    public void getCityList(Callback callback){
        apiInterface.getCity().enqueue(callback);
    }

    public void getMovieList(String id, Callback callback){
        apiInterface.getMovie(id).enqueue(callback);
    }
}
