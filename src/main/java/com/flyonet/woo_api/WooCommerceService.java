package com.flyonet.woo_api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

/**
 * Created by jorge on 17/2/17.
 */
public interface WooCommerceService {
    @GET("/wp-json/wc/v1/products/{id}{auth}")
    Call<Product> getProduct(@Path("id") int id, @Path("auth") String auth);
}
