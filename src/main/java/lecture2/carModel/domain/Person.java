package lecture2.carModel.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author maron
 */
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String firstname;
    @Basic
    private String lastname;
    @Basic
    private String SIN;
    @Basic
    private String age;
    @Basic
    private String insuredBy;
    @ManyToMany(mappedBy = "persons")
    private List<Car> cars;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSIN() {
        return SIN;
    }

    public void setSIN(String SIN) {
        this.SIN = SIN;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getInsuredBy() {
        return insuredBy;
    }

    public void setInsuredBy(String insuredBy) {
        this.insuredBy = insuredBy;
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