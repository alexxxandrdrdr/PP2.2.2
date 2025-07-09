package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.carDao.CarDao;
import web.model.Car;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDAO) {
        this.carDao = carDAO;
    }

    @Override
    public ArrayList<Car> getCarsList() {
        return carDao.getCars();
    }

    public ArrayList<Car> getCarsListByCount(String count) {
        if (count == null || count.isEmpty()) {
            return carDao.getCars();
        } else {
            return carDao.getCars().stream().limit(Integer.parseInt(count)).collect(Collectors.toCollection(ArrayList::new));

        }
    }
}
