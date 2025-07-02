package web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import java.util.stream.Collectors;


@Controller
public class CarsController {

    private final CarService carService;
    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;

    }


    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false)String count, Model model) {
        if (count == null || count.isEmpty()) {
            model.addAttribute("cars", carService.getCarsList());
        }
        else {
            model.addAttribute("cars", carService.getCarsList().stream().limit(Integer.parseInt(count)).collect(Collectors.toList()));
        }
        return "cars/carsTable";
    }

}
