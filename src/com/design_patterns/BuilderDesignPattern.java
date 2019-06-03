package com.design_patterns;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class BuilderDesignPattern {


    public static void main(String[] args) {
        Product product = Product.builder()
                                .id("")
                                .build();
    }

    @Getter
    @Setter
    @ToString
    static class Product {

        String id;
        String name;
        String price;
        Integer stoc;
        String type;
        
        public static ProductBuilder builder() {
            return new ProductBuilder();
        }

        static class ProductBuilder {
            private Product product;

            private ProductBuilder() {
                product = new Product();
            }

            public ProductBuilder id(String id) {
                product.setId(id);
                return this;
            }

            public ProductBuilder name(String name) {
                product.setName(name);
                return this;
            }

            public ProductBuilder price(String price) {
                product.setPrice(price);
                return this;
            }

            public ProductBuilder stoc(Integer stoc) {
                product.setStoc(stoc);
                return this;
            }


            public Product build() {
                return product;
            }

        }



    }

}
