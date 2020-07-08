/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retrofit;
import okhttp3.ResponseBody;
import pbo08.datafetch.model.ResponseUser;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author MZ17
 */
public interface ApiInterface {
    @FormUrlEncoded
    @POST("/pbo08/public/login")
    Call<ResponseUser> postLogin(
            @Field("Username") String username,
            @Field("Password") String password
    );
}
    