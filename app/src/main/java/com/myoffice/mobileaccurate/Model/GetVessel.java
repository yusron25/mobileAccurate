package com.myoffice.mobileaccurate.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetVessel {
    @SerializedName("VESSEL_NAME")
    @Expose
    private String vESSELNAME;

    public String getVESSELNAME() {
        return vESSELNAME;
    }

    public void setVESSELNAME(String vESSELNAME) {
        this.vESSELNAME = vESSELNAME;
    }

}
