package org.breaze.creacionales.builder;

public class Director {
    private IHouseBuilder builder;

    public void setBuilder(IHouseBuilder builder) {
        this.builder = builder;
    }

    public void buildLuxuryHouse(){
        builder.reset()
                .bedrooms(5)
                .bathrooms(3)
                .garage(true)
                .swimmingPool(true);
    }
    public void buildNormalHouse(){
        builder.reset()
                .bedrooms(2)
                .bathrooms(1)
                .garage(false)
                .swimmingPool(false);
    }
}
