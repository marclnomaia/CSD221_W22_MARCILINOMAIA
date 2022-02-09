package lab2_part2.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author maron
 */

@Entity
public class Employee extends Person {

    @Basic
    private String title;
    @Basic
    private double salary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}