package com.design_patterns;

import lombok.ToString;

public class FluentBuilder {

    public static void main(String[] args) {
        Product product = new Product();
        product.withId("id")
               .withName("name")
               .withPrice(100) //Euro
               .withStoc(10)
               .withType("type");
        System.out.println(product);
    }

    @ToString
    static class Product {

        String id;
        String name;
        Integer price;
        Integer stoc;
        String type;

        public Product withId(String id) {
            this.id = id;
            return this;
        }

        public Product withName(String name) {
            this.name = name;
            return this;
        }

        public Product withPrice(Integer price) {
            this.price = price;
            return this;
        }

        public Product withStoc(Integer stoc) {
            this.stoc = stoc;
            return this;
        }

        public Product withType(String type) {
            this.type = type;
            return this;
        }
    }

}
