package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.DaoServiceImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarService {

    private final DaoServiceImpl dao;

    @Autowired
    public CarService(DaoServiceImpl dao) {
        this.dao = dao;
    }

    public List<Car> getCarList(int count) {
        return dao.getCarList(count);
    }
}
