package lecture2.carModel.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;

/**
 * @author maron
 */
@Embeddable
public class Behaviors {

    @Basic
    private String accelerate;
    @Basic
    private String stop;
    @Basic
    private String turn;
    @ManyToMany
    private List<Car> cars;

    public String getAccelerate() {
        return accelerate;
    }

    public void setAccelerate(String accelerate) {
        this.accelerate = accelerate;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public String getTurn() {
        return turn;
    }

    public void setTurn(String turn) {
        this.turn = turn;
    }

    public List<Car> getCars() {
        if (cars == null) {
            cars = new ArrayList<>();
        }
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        getCars().add(car);
    }

    public void removeCar(Car car) {
        getCars().remove(car);
    }

}