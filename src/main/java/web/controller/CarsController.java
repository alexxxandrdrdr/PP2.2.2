package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

import java.util.ArrayList;

@Controller
public class CarsController {
    @Autowired
    private CarServiceImpl carService;

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count")int count, Model model) {

        model.addAttribute("cars", carService.getCarsList());
        model.addAttribute("count", count);
        return "Cars/cars";
    }

}
