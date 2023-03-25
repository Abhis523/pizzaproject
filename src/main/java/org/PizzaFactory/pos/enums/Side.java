package org.PizzaFactory.pos.enums;

public enum Side {
    COLD_DRINK("Cold drink", 55.0),
    MOUSSE_CAKE("Mousse cake", 90.0);

    private final String name;
    private final Double price;

    Side(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
