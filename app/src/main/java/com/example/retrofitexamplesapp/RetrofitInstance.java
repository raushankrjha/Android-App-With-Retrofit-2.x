package com.example.retrofitexamplesapp;
import com.example.retrofitexamplesapp.Model.User;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
    //create interface of retrofit
    public interface RetrofitInstance
    {
        @GET("/users")
        Call<List<User>> getUsersList();
    }

