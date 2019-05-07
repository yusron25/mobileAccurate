package com.myoffice.mobileaccurate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.myoffice.mobileaccurate.Model.GetVessel;
import com.myoffice.mobileaccurate.Model.ResVessel;
import com.myoffice.mobileaccurate.Rest.ApiClient;
import com.myoffice.mobileaccurate.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    ApiInterface mApiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void goonline(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
        finish();
    }
}
