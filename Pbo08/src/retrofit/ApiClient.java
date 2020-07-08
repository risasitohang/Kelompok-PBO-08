/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author MZ17
 */
public class ApiClient {
     private static final String BASE_URL = "http://192.168.43.232:";
    public static Retrofit mRetrofit;
    public static Retrofit getRetrofit() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return mRetrofit;
    }
    public ApiInterface  Api(){
        return mRetrofit.create(ApiInterface.class);
    }
}
