package com.flyonet.woo_api;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by jorge on 17/2/17.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("START");
        URL url = null;
        try {
            url = new URL("https://google.com");
        } catch (MalformedURLException e) {
            System.out.println("NOT VALID URL");
            System.exit(0);
        }
        WooCommerce wooCommerce = new WooCommerce(url, "sdd", "");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        WooCommerceService service = retrofit.create(WooCommerceService.class);
        Response<Product> product = service.getProduct(50, wooCommerce.getAuth()).execute();
        System.out.println(product.raw());
    }
}
