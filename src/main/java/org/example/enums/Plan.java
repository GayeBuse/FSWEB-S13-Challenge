package org.example.enums;

public enum Plan {
    BASIC("BASIC", 1),
    OPSIYONEL("OPSİYONEL", 2);

    private  String name;
    private int price;

    private Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
