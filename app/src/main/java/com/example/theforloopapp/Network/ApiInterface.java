package com.example.theforloopapp.Network;
 import com.example.theforloopapp.ModelClass.getScanData;
 import com.example.theforloopapp.ModelClass.setScanData;

 import retrofit2.Call;
 import retrofit2.http.Body;
 import retrofit2.http.Field;
        import retrofit2.http.FormUrlEncoded;
        import retrofit2.http.GET;
        import retrofit2.http.Header;
        import retrofit2.http.Headers;
        import retrofit2.http.POST;
        import retrofit2.http.Path;
        import retrofit2.http.Query;
        import retrofit2.http.Streaming;
        import retrofit2.http.Url;

public interface ApiInterface {
//
//    @POST("valProduct")
//    Call<getScanData> getScanCode();


    @POST("valProduct")
    @Headers({"Content-Type: application/json"})
    Call<getScanData>getScanData(@Body setScanData scanData);


}


//    @FormUrlEncoded
//    @POST("user/token")
//    @Headers({"Authorization: QmR0ZkQxQnJzbkNRQTFuUGZtRldPNVhPbGt6OGtFVXg6c1M5dGJYNmd0eTBFQTNJQw==",
//            "Content-Type: application/x-www-form-urlencoded"
//    })
//    Call<UserToken> getToken(@Field("grant_type") String grant_type, @Field("device_code") String device_code);


//    @GET("ota-api/artifacts")
////Call<Artifacts> getArtifacts(@Header("Authorization") String Bearer, @Query("start") int start, @Query("end") int end);
//    Call<List<Artifacts>> getArtifacts(@Header("Authorization") String Bearer, @Query("start") int start, @Query("end") int end, @Query("deviceModel") String deviceModel);
//
//    @POST("ota-api/downloadurltoken")
//    Call<DownloadUrlToken> getUrlToken(@Header("Authorization") String Bearer,@Query("duration") int duration);
//
//    @GET("ota-api/downloadurltoken/validate")
//    Call<DownloadUrlTokenValidate> validateDownloadUrlToken(@Header("Authorization")