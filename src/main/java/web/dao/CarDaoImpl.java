package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {


    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Kia", 2012, 1.6));
        cars.add(new Car("Peugeot", 2006, 1.6));
        cars.add(new Car("Ford", 2000, 2.0 ));
        cars.add(new Car("Renault", 2005, 1.8));
        cars.add(new Car("Lada", 2020, 1.5));
    }


    public List<Car> getAllCars() {
        return cars;
    }
}
