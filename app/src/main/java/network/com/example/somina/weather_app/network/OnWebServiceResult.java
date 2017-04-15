package com.example.somina.weather_app.network;

import com.example.somina.weather_app.utils.CommonUtilities;

public interface OnWebServiceResult {
    public void getWebResponse(String result, CommonUtilities.SERVICE_TYPE type);
}