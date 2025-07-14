package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
@Repository
public class CarDaoImpl implements CarDao {

    private ArrayList<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "540i", 2010));
        cars.add(new Car("GAZ", "3102", 2008));
        cars.add(new Car("Land Rover", "Range Rover", 2015));
        cars.add(new Car("Mini", "Cooper S", 2010));
        cars.add(new Car("Land Rover", "Discovery", 2019));
    }


    @Override
    public ArrayList<Car> getCars() {
        return cars;
    }
}
