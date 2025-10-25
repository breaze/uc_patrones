package org.breaze.creacionales.builder;

public interface IHouseBuilder {
    HouseBuilder reset();
    HouseBuilder bedrooms(int bedrooms);
    HouseBuilder bathrooms(int bathrooms);
    HouseBuilder garage(boolean garage);
    HouseBuilder swimmingPool(boolean swimmingPool);
    House getHouse();
}
