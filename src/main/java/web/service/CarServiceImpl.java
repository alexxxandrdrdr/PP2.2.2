package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.CarDAO.CarDAOImpl;
import web.model.Car;
import java.util.ArrayList;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private final CarDAOImpl carDAO;

    public CarServiceImpl(CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public ArrayList<Car> getCarsList(){
        return carDAO.getCars();
    }
}
