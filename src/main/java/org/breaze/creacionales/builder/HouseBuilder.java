package org.breaze.creacionales.builder;

public class HouseBuilder implements IHouseBuilder{
    private House house;

    public HouseBuilder() {
        this.reset();
    }

    @Override
    public HouseBuilder reset() {
        this.house = new House();
        return this;
    }

    @Override
    public HouseBuilder bedrooms(int bedrooms) {
        house.setBedrooms(bedrooms);
        return this;
    }

    @Override
    public HouseBuilder bathrooms(int bathrooms) {
        house.setBathroom(bathrooms);
        return this;
    }

    @Override
    public HouseBuilder garage(boolean garage) {
        house.setGarage(garage);
        return this;
    }

    @Override
    public HouseBuilder swimmingPool(boolean swimmingPool) {
        house.setSwimmingPool(swimmingPool);
        return this;
    }

    @Override
    public House getHouse() {
        return this.house;
    }


}
