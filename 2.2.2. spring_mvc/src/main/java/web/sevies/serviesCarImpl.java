package web.sevies;

import org.springframework.stereotype.Component;
import web.Dao.carDao;
import web.Dao.carDoaImpl;
import web.model.Car;

import java.util.List;
@Component
public class serviesCarImpl implements servesCarImpl{

    private carDao  carDao=new carDoaImpl();
    @Override
    public List<Car> getCar(int number) {
        return carDao.getCar(number);
    }

    @Override
    public List<Car> getAllCar() {
        return carDao.getAllCar();
    }

}
