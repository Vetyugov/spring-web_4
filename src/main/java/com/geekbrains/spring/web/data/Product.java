package com.geekbrains.spring.web.data;

public class Product {
    private Long id;
    private String name;
    private Integer amount;

    public Product(){

    }

    public Product(Long id, String name, Integer amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(Integer delta) {
        Integer amount = this.amount + delta;
        if(amount < 0){
            amount = 0;
        }
        this.amount = amount;
    }
}
