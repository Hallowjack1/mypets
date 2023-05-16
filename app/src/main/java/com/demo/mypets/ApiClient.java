package com.demo.mypets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


class ApiClient {

    private static final String BASE_URL = "http://192.168.254.103/demo_pets/";
    private static Retrofit retrofit;

    static Retrofit getApiClient(){

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

        }
        return retrofit;
    }

}
