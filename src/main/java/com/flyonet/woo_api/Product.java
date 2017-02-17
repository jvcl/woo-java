/*
 * This file is part of WOO-JAVA
 *
 * Copyright (C) 2017 Jorge Valdivia
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.flyonet.woo_api;

public class Product {
    private int id;
    private String name;
    private String slug;
    private String permalink;
    private String type;
    private String status;
    private boolean featured;
    private String description;
    private String sku;
    private String price;
    private String regular_price;
    private String sale_price;

    Product(){

    }
    Product(String title, String price) {
        this.name = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
