package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.CarDAO.CarDAOImpl;
import web.model.Car;
import java.util.ArrayList;

@Service
public class CarServiceImpl implements CarService {

    private final CarDAOImpl carDAO;
    @Autowired
    public CarServiceImpl(CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public ArrayList<Car> getCarsList(){
        return carDAO.getCars();
    }
}
