package web.DAO;

import web.model.Car;

import java.util.List;

public interface DaoService {

    public List<Car> getCarList(int count);
}
