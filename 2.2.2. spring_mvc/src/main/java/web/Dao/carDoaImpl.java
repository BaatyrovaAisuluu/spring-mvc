package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class carDoaImpl  implements carDao{

    private List<Car> carList;

    {
       carList=new ArrayList<>();
       carList.add(new Car(1,"BMW","3/43"));
       carList.add(new Car(2,"Step","cars%"));
       carList.add(new Car(3,"Porter","w/re"));
       carList.add(new Car(4,"Mercedes","hg"));
       carList.add(new Car(5,"Lexus","pd"));
    }


    @Override
    public List<Car> getCar(int number) {
        List<Car>carList1=new ArrayList<>();
        for (int i = 0; i <number; i++) {
            if(number>=5){
                return carList;
            }else {
                carList1.add(carList.get(i));
            }
        }
        return carList1;
    }

    @Override
    public List<Car> getAllCar() {
        return carList;
    }
}
