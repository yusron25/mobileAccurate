package com.myoffice.mobileaccurate.Rest;

import com.myoffice.mobileaccurate.Model.GetVessel;
import com.myoffice.mobileaccurate.Model.ResVessel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("vessel")
    Call<ResVessel> getVessel();
}
