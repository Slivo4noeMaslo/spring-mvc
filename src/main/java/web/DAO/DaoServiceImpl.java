package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoServiceImpl implements DaoService {

    private List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "X5", 1000));
        carList.add(new Car("Audi", "A4", 800));
        carList.add(new Car("Vaz", "2107", 500));
        carList.add(new Car("Kia", "Rio", 600));
        carList.add(new Car("Toyota", "RAV4", 700));
    }


    @Override
    public List<Car> getCarList(int count) {
        if(count > 5) {
            count = 5;
        }
        if(count == 0) {
            return carList;
        }
        return new ArrayList<>(carList.subList(0, count));
    }
}
