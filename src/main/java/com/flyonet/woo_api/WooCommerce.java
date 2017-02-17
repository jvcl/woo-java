package com.flyonet.woo_api;

import java.net.URL;

/**
 * Created by jorge on 16/2/17.
 */
public class WooCommerce {
    private String consumerKey;
    private String consumerSecret;
    private String url;
    private final URL URL;

    public WooCommerce(URL URL, String consumerKey, String consumerSecret) {
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.URL = URL;
    }

    public String getAuth(){
        return "?consumer_key="+ consumerKey + "&consumer_secret=" + consumerSecret;
    }

    public Product createProduct(){
        return new Product();
    }

    public Product getProductByID(int ID) {
        return new Product();

    }
    public Product getProductBySKU(String SKU) {
        return new Product();
    }

    public Product updateProduct(Product product) {
        return new Product();
    }

    public Product deleteProduct(Product product) {
        int id = product.getId();
        return new Product();
    }

    public Product deleteProduct(int ID) {
        return new Product();
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public java.net.URL getURL() {
        return URL;
    }
}
