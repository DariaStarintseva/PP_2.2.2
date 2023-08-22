package web.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

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

    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }





}
