package com.example.retrofitproject;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.retrofitproject.model.KasusIndonesia;
import com.example.retrofitproject.rest.ApiClient;
import com.example.retrofitproject.rest.ApiInterface;

public class HomeActivity extends AppCompatActivity {

    TextView konfirmasi, perawatan, sembuh, meninggal, perprovinsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        konfirmasi = findViewById(R.id.tvKonfirmasi);
        perawatan = findViewById(R.id.tvPerawatan);
        sembuh = findViewById(R.id.tvSembuh);
        meninggal = findViewById(R.id.tvMeninggal);
        perprovinsi = findViewById(R.id.tvPerProvinsi);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<KasusIndonesia> call = apiService.getDataKasus();
        call.enqueue(new Callback<KasusIndonesia>() {
            @Override
            public void onResponse(Call<KasusIndonesia> call, Response<KasusIndonesia> response) {
                konfirmasi.setText(response.body().getJumlahKasus());
                perawatan.setText(response.body().getPerawatan());
                sembuh.setText(response.body().getSembuh());
                meninggal.setText(response.body().getMeninggal());
            }

            @Override
            public void onFailure(Call<KasusIndonesia> call, Throwable t) {
                Log.e("Error", t.toString());
            }
        });

    }

    public void DataProvinsi(View view) {
        startActivity(new Intent(HomeActivity.this,MainActivity.class));
    }
}