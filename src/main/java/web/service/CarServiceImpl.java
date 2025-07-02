package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.carDao.CarDao;
import web.model.Car;
import java.util.ArrayList;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDAO;
    @Autowired
    public CarServiceImpl(CarDao carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public ArrayList<Car> getCarsList(){
        return carDAO.getCars();
    }
}
