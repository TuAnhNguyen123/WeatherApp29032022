package com.example.weatherapp29032022.data.remote;

/**
 * Created by ntudroid on 7/2/2022.
 */

import com.example.weatherapp29032022.data.remote.model.WeatherSearchResponse;

import io.reactivex.rxjava3.core.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Support end point
 */
public interface ApiService {

    @GET("data/2.5/weather")
    Flowable<WeatherSearchResponse> searchCityName(
            @Query("appid") String appid,
            @Query("units") String units,
            @Query("q")     String q
    );
}