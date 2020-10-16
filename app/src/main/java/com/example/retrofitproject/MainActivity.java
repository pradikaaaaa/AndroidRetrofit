package com.example.retrofitproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.retrofitproject.adapter.ProvinsiAdapter;
import com.example.retrofitproject.model.Provinsi;
import com.example.retrofitproject.model.ProvinsiResponse;
import com.example.retrofitproject.rest.ApiClient;
import com.example.retrofitproject.rest.ApiInterface;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public ProvinsiAdapter provinsiAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_provinsi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<ProvinsiResponse> call = apiService.getDataProvinsi();
        call.enqueue(new Callback<ProvinsiResponse>() {
            @Override
            public void onResponse(Call<ProvinsiResponse> call, Response<ProvinsiResponse> response) {
                List<Provinsi> provinsiList = response.body().getProvinsiList();
                recyclerView.setAdapter(new ProvinsiAdapter(provinsiList,getApplicationContext()));
            }

            @Override
            public void onFailure(Call<ProvinsiResponse> call, Throwable t) {
                Log.e("Error", t.toString());
            }
        });
    }
}