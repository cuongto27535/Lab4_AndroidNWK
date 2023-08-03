package com.example.lab4_androidnwk.API;


import android.telecom.Call;

import com.example.lab4_androidnwk.Model.ServerRequest;
import com.example.lab4_androidnwk.Model.ServerResponse;

import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {
    @POST("learn-login-register/")
    Call<ServerResponse> operation(@Body ServerRequest request);
}