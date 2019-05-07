package com.myoffice.mobileaccurate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.myoffice.mobileaccurate.Model.GetVessel;
import com.myoffice.mobileaccurate.Model.ResVessel;
import com.myoffice.mobileaccurate.Rest.ApiClient;
import com.myoffice.mobileaccurate.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Activity extends AppCompatActivity {
    ApiInterface
    mApiInterface = ApiClient.getClient().create(ApiInterface .class);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Call<ResVessel> resVesselCall = mApiInterface.getVessel();

        resVesselCall.enqueue(new Callback<ResVessel>() {
            @Override
            public void onResponse(Call<ResVessel> call, Response<ResVessel> response) {
                List<GetVessel> getVesselList= response.body().getResults();
                Log.d("yaw","aasd"+getVesselList.size());
            }

            @Override
            public void onFailure(Call<ResVessel> call, Throwable t) {
                Log.d("yaw","aasdx");

            }
        });

    }
}
