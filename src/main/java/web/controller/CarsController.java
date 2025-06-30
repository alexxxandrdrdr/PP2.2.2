package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count")int count, Model model) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW","540i",2010));
        cars.add(new Car("GAZ","3102",2008));
        cars.add(new Car("Land Rover","Range Rover",2015));
        cars.add(new Car("Mini","Cooper S",2010));
        cars.add(new Car("Land Rover","Discovery",2019));
        model.addAttribute("cars", cars);
        model.addAttribute("count", count);
        return "Cars/cars";
    }

}
