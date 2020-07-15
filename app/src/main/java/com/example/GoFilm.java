package com.example;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface GoFilm {
    @Multipart
    @POST("some/endpoint")
    Call<Poster> uploadImage(@Part("description") String description, @Part("image") RequestBody image);

    String BASE_URL = "https://kudago.com/public-api/v1.2/movies/" ;

    Retrofit client = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .build();

}

