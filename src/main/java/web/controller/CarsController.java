package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarsController {

    private final CarService carService;


    public CarsController(CarService carService) {
        this.carService = carService;

    }


    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", required = false) String count, Model model) {
        model.addAttribute("cars", carService.getCarsListByCount(count));
        return "cars/carsTable";
    }

}
