package web.service;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface CarService {
    public List<Car> getAllCars();

    public List<Car> getCars(int count);


}
